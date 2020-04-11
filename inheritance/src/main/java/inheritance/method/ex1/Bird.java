package inheritance.method.ex1;

import java.io.File;

public abstract class Bird {
    public void fly() { System.out.println("Bird is flying"); }

    public static void main(String[] args) {
        Bird bird = new Pelican();
        bird.fly();
        String path = "fsd/dfs/";
        new File(path);

        System.out.println("END");
    }
}

class Pelican extends Bird {
    public void fly() { System.out.println("Pelican is flying"); }

}
