package user;


import org.junit.Test;

import java.lang.reflect.Field;

public class StudentTest {
    @Test
    public void test1() {
        Student student = new Student();

        System.out.println(student);
    }

    @Test
    public void test2() throws Exception {
        Student student = new Student();

        Field name = student.getClass().getDeclaredField("name");
        Field age = student.getClass().getDeclaredField("age");
        name.setAccessible(true);
        age.setAccessible(true);
        name.set(student, "Polina");
        age.set(student, 25);

        System.out.println(student);
    }
}
