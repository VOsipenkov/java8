package interfaces;

import interfaces.inner.Arial;

public class Main extends Arial{
    public static void main(String[] args) {
        Flauder flauder = new Flauder();
        flauder.swim();
        flauder.jump();

        System.out.println(flauder.SENTENCE2);

        Arial arial = new Arial();
        arial.sayHello();
    }
}