import model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(User.builder()
                .name("Alex")
                .age(25)
                .registration(LocalDateTime.now().plusMonths(3))
                .build());
        users.add(User.builder().name("Olga").age(28).build());

        p(users);
    }

    public static void p(Object... o) {
        if (o == null) return;
        for (Object o1 : o) {
            System.out.println(o1);
        }
    }
}
