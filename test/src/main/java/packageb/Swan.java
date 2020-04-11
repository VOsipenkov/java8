package packageb;

import packagea.Bird;

public class Swan extends Bird {
    public static void print() {
        System.out.println("swan is fling..");
    }

    public void fly() {
        System.out.println("called swan.fly");
        print();
    }
}
