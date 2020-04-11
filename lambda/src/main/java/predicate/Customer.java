package predicate;


public class Customer implements User{
    private String name;
    private boolean confidential;

    public Customer(String name, boolean confidential) {
        this.name = name;
        this.confidential = confidential;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                "confidential='" + confidential+ '\'' +
                '}';
    }

    @Override
    public boolean isConfidential() {
        return confidential;
    }
}
