package finallyreturn;

public class Main {
    public static void main(String[] args) {
        new Main().tryTo();
    }

    public void tryTo() {
        try {
            System.out.println("in try block..");
            return;
        } catch (Exception e) {
            System.out.println("exception occurs..");
        } finally {
            System.out.println("finally block code..");
        }
    }
}
