package alex.rest;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;

import java.util.Map;

@JsonDeserialize(using = EmbeddedMapDesiarilizer.class)
public class EmbeddedMap {

    private Map<Class, Object> embedded;

    public Map<Class, Object> getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Map<Class, Object> embedded) {
        this.embedded = embedded;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("embedded", embedded)
                .toString();
    }
}
