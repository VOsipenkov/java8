package user;

public class Enrollee {
    private int schoolNumber = 0;

    private Enrollee(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    private void selectSubject() {
        System.out.format("Enrollee selected %s", schoolNumber);
    }

    @Override
    public String toString() {
        return "Enrollee{" +
                "schoolNumber=" + schoolNumber +
                '}';
    }
}
