package inheritance.method;

public class Kia {
    public String model = "kia";
    
    public void printModel(){
//        System.out.println(getModel());
        engineStart();
        System.out.println("--------");
    }
    
    public String getModel(){
        return "Kia";
    }
    
    public static void engineStart(){
        System.out.println("kia engine started..");
    }
}
