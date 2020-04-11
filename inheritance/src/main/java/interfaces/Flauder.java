package interfaces;

public class Flauder extends Porgy {
    public Flauder(){}
    
    public void swim() {
        System.out.println("Flauder is swimming..");
    }

    public void jump() {
        System.out.format("Flauder said: %s", this.SENTENCE2);
    }
}
