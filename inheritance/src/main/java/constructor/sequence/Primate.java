package constructor.sequence;

public class Primate {
   private String city;

    public Primate(String city) {
        this.city = city;
        System.out.println("Primate(String city)");
    }

    public Primate() {
        System.out.println("Primate()");
    }
}
