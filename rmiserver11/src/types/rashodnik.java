package types;

import java.io.Serializable;

public class rashodnik implements Serializable {
    
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public rashodnik(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    @Override
    public String toString(){
        return name;
    }
}