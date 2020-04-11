package constructor.sequence;

public class Ape extends Primate {
    private String city;

    public Ape(String city) {
        super(city);
        this.city = city;
        System.out.println("Ape(String city)");
    }

    public Ape() {
        System.out.println("Ape()");
    }
}
