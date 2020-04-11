package virtualmethod;

public class Bird {
    public final String NAME = "bird";

    public String getName() {
        return NAME;
    }

    public void fly() {
        System.out.println(getName());
    }
}
