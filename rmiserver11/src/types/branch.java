package types;

import java.io.Serializable;

public class branch implements Serializable {
    
    private String tree;
    private String description;

    public String getTree() {
        return tree;
    }

    public String getDescription() {
        return description;
    }

    public branch(String tree, String description) {
        this.tree = tree;
        this.description = description;
    }
    
    @Override
    public String toString(){
        return "Дерево для веника - " + tree;
    }
}
