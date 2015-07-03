package alex.rest.test;

import com.fasterxml.jackson.annotation.*;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import javax.annotation.Generated;
import java.util.HashMap;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "descr"
})
public class ClassAlexRestEmBean2 {

    @JsonProperty("descr")
    private String descr;
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The descr
     */
    @JsonProperty("descr")
    public String getDescr() {
        return descr;
    }

    /**
     *
     * @param descr
     * The descr
     */
    @JsonProperty("descr")
    public void setDescr(String descr) {
        this.descr = descr;
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
                .add("descr", descr)
                .add("additionalProperties", additionalProperties)
                .toString();
    }
}
