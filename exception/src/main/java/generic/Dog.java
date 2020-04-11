package generic;

public class Dog implements Animal{
    private String name;
    private static final String type = "dog";

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
