package inheritance;

public class Father {
    protected String person = "father";

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    protected void readBook(){
        System.out.println("father is reading a book..");
    }
    
}
