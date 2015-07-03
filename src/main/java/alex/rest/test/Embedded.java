package alex.rest.test;

import com.fasterxml.jackson.annotation.*;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import javax.annotation.Generated;
import java.util.HashMap;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "class alex.rest.EmBean1",
        "class alex.rest.EmBean2"
})
public class Embedded {

    @JsonProperty("class alex.rest.EmBean1")
    private ClassAlexRestEmBean1 classAlexRestEmBean1;

    @JsonProperty("class alex.rest.EmBean2")
    private ClassAlexRestEmBean2 classAlexRestEmBean2;

    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The classAlexRestEmBean1
     */
    @JsonProperty("class alex.rest.EmBean1")
    public ClassAlexRestEmBean1 getClassAlexRestEmBean1() {
        return classAlexRestEmBean1;
    }

    /**
     *
     * @param classAlexRestEmBean1
     * The class alex.rest.EmBean1
     */
    @JsonProperty("class alex.rest.EmBean1")
    public void setClassAlexRestEmBean1(ClassAlexRestEmBean1 classAlexRestEmBean1) {
        this.classAlexRestEmBean1 = classAlexRestEmBean1;
    }

    /**
     *
     * @return
     * The classAlexRestEmBean2
     */
    @JsonProperty("class alex.rest.EmBean2")
    public ClassAlexRestEmBean2 getClassAlexRestEmBean2() {
        return classAlexRestEmBean2;
    }

    /**
     *
     * @param classAlexRestEmBean2
     * The class alex.rest.EmBean2
     */
    @JsonProperty("class alex.rest.EmBean2")
    public void setClassAlexRestEmBean2(ClassAlexRestEmBean2 classAlexRestEmBean2) {
        this.classAlexRestEmBean2 = classAlexRestEmBean2;
    }

    @JsonAnyGetter
    public java.util.Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("classAlexRestEmBean1", classAlexRestEmBean1)
                .add("classAlexRestEmBean2", classAlexRestEmBean2)
                .add("additionalProperties", additionalProperties)
                .toString();
    }
}
