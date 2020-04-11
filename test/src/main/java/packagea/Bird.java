package packagea;

public class Bird {
    public static void print() {
        System.out.println("bird is fling()");
    }

    public void fly() {
        System.out.println("called bird.fly");
        print();
    }
}
