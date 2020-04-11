package user;

import org.junit.Test;

public class TeacherTest {
    @Test
    public void test1() {
        Teacher teacher = new Teacher("Irina", "Vasnetsova");

        System.out.println(teacher);
    }

    @Test
    public void test2() throws Exception {
        Class teacherClass = Class.forName(Teacher.class.getName());
        Teacher teacher = (Teacher) teacherClass.getConstructor(String.class, String.class).newInstance("Olga", "Barkovskaya");

        System.out.println(teacher);
    }
}
