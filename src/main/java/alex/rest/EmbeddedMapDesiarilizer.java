package alex.rest;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.util.ClassUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmbeddedMapDesiarilizer extends JsonDeserializer<EmbeddedMap> {
    @Override
    public EmbeddedMap deserialize(JsonParser jp, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        try {
            JsonNode node = jp.getCodec().readTree(jp);
            JsonNode embedded = node.get("embedded");
            Iterator<Map.Entry<String, JsonNode>> fields = embedded.fields();
            EmbeddedMap embeddedMap = new EmbeddedMap();
            Map<Class, Object> inMap = new HashMap<>();
            embeddedMap.setEmbedded(inMap);
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> next = fields.next();
                String className = next.getKey().substring(6);
                Class<?> aClass = ClassUtil.findClass(className);
                Object o = aClass.newInstance();
                //copy properties
                EmBean1 o1 = (EmBean1) o;
                o1.setName(String.valueOf(next.getValue().iterator().next()));
                System.out.println(o1);
                inMap.put(aClass, o1);
            }
            return embeddedMap;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
