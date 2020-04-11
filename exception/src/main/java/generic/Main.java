package generic;

public class Main {
    public static void main(String[] args) {
        Action action = new ActionImpl<Animal>();
        Cat cat = new Cat("Markiza");
        Dog dog1 = new Dog("Palkan");
        Dog dog2 = new Dog("Timofey");
        
        action.move(cat);
        action.jump(dog1);
        action.move(dog2);
    }
}
