package alex.rest;

import jersey.repackaged.com.google.common.base.MoreObjects;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigInteger;
import java.util.Map;

@XmlRootElement
public class SourceBean {
    private BigInteger id;
    private String title;
    private EmbeddedMap map;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EmbeddedMap getMap() {
        return map;
    }

    public void setMap(EmbeddedMap map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("title", title)
                .add("map", map)
                .toString();
    }
}
