package inheritance.method.instance.animals;

public class Main {
    public static void main(String[] args) {
        Animal.voice();
        Wolf.voice();
        
        Animal animal = new Animal();
        animal.voice();
        Wolf wolf = new Wolf();
        wolf.voice();
    }
}
