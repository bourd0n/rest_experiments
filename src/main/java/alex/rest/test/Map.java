package alex.rest.test;

import com.fasterxml.jackson.annotation.*;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import javax.annotation.Generated;
import java.util.HashMap;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "embedded"
})
public class Map {

    @JsonProperty("embedded")
    private Embedded embedded;
    @JsonIgnore
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The embedded
     */
    @JsonProperty("embedded")
    public Embedded getEmbedded() {
        return embedded;
    }

    /**
     *
     * @param embedded
     * The embedded
     */
    @JsonProperty("embedded")
    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
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
                .add("embedded", embedded)
                .add("additionalProperties", additionalProperties)
                .toString();
    }
}
