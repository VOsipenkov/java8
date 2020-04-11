package interface_pack;

public class Manager extends Head{
    public static void main(String[] args) {
        new Manager().start();
        new Manager().getName();
    }
    
    public void start(){
        System.out.println("start..");
    }
}
