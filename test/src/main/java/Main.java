import packagea.Bird;
import packageb.Swan;


public class Main {
    public static void main(String[] args) {
        Bird bird = new Swan();
        bird.fly();
        
        bird = new Bird();
        bird.fly();
    }
}
