package user;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class EnrolleeTest {
    @Test
    public void test1() throws Exception {
        Class enrolleeClass = Class.forName(Enrollee.class.getName());
        Constructor constructor = enrolleeClass.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        Enrollee enrollee = (Enrollee) constructor.newInstance(385);

        System.out.println(enrollee);
        Method method = enrollee.getClass().getDeclaredMethod("selectSubject");
        method.setAccessible(true);
        method.invoke(enrollee);

    }
}
