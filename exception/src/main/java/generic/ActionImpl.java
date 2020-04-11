package generic;

public class ActionImpl<T> implements Action {
    public <T> void move(T obj) {
        if (obj instanceof Animal) {
            System.out.println(((Animal) obj).getName() + " : " + ((Animal) obj).getType() + " moved..");
        }
    }

    public <T> void jump(T obj) {
        if (obj instanceof Animal) {
            System.out.println(((Animal) obj).getName() + " : " + ((Animal) obj).getType() + " jump..");
        }
    }
}
