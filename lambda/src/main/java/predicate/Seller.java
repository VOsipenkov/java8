package predicate;

public class Seller implements User {
    private String name;
    private boolean confidential;

    public Seller(String name, boolean confidential) {
        this.name = name;
        this.confidential = confidential;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                "confidential='" + confidential + '\'' +
                '}';
    }

    @Override
    public boolean isConfidential() {
        return confidential;
    }
}
