package generic;

public class Cat implements Animal {
    private String name;
    private static final String type = "cat";

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
