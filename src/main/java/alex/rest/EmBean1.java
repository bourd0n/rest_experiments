package alex.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmBean1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmBean1{" +
                "name='" + name + '\'' +
                '}';
    }
}
