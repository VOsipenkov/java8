package predicate;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new LinkedList<>();
        users.add(new Customer("Oracle", true));
        users.add(new Customer("NetCracker", true));
        users.add(new Customer("Intel", true));
        users.add(new Seller("re:Store", false));
        users.add(new Seller("Lanit", true));
        users.add(new Seller("Samsung", false));

        p(users, u -> !u.isConfidential());
    }

    private static void p(List<User> users, Printable printable) {
        users.stream().filter(u -> printable.test(u)).forEach(u -> System.out.println(u));
    }
}
