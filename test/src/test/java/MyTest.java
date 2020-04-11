import org.junit.Test;

public class MyTest {
    @Test
    public void test() {
        Integer i = new Integer(1);

        System.out.println(i);
    }

    @Test
    public void test2() {
        Integer i = 1;

        System.out.println(i);
    }

    @Test
    public void test3() {
        int i = 'c';
        char c = 5;
    }

    @Test
    public void test4() {
        boolean b1 = false;
        boolean b2 = true;
        boolean res1 = b1 && b2;
        boolean res2 = b1 & b2;

        System.out.println(res1);
        System.out.println(res2);
    }
}
