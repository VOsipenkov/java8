package inheritance.method;

public class Rio extends Kia {
    public String model = "Kia Rio";

//    public void printModel() {
//        System.out.println(getModel());
//        engineStart();
//    }

    public String getModel() {
        return "Kia Rio";
    }

    public static void engineStart() {
        System.out.println("kia RIO engine started..");
    }
}
