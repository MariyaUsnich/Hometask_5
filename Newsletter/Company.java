package Newsletter;

public class Company extends Article {

    public Company() {
        super();
    }

    public Company(String _name, String _author) {
        super(_name, _author);
    }

    private final String section = "BusinessInfo";

    public String toString() {
        return "Article: " + super.toString() + " / " + section;
    }

    @Override
    public void language() {
        System.out.println("In Russian and English");
    }
}
