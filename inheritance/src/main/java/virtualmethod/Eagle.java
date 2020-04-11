package virtualmethod;

public class Eagle extends Bird {
//    public final String NAME = "Eagle";

    public void fly() {
        System.out.println(getName());
    }
    
    public String getName() {
        return NAME;
    }
}
