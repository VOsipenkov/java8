package inheritance;

public class Sun extends Father {
    private String name = "alex";
    private String surname;
    private int age;

    public void readBook() {
        System.out.println(this.name);
        System.out.println(super.person);
    }

    public Sun(String surname) {
        this(surname, 23);
    }

    public Sun(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public String toString() {
        return String.format("name:%s, surname:%s, age:%d", name, surname, age);
    }

}
