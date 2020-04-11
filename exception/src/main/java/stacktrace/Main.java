package stacktrace;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void hop() {
        throw new NullPointerException("message");
    }
}
