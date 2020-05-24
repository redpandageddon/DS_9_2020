package types;

public class Branch {

    private String tree;
    private String description;

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    public Branch() {
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Branch(String tree, String description) {
        this.tree = tree;
        this.description = description;
    }

    @Override
    public String toString(){
        return "Дерево для веника - " + tree;
    }

}
