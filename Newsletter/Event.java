package Newsletter;

public class Event extends Article {

    public Event() {
        super();
    }

    public Event(String _name, String _author) {
        super(_name, _author);
    }

    private final String section = "Events";

    @Override
    public String toString() {
        return "Article: " + super.toString() + " / " + section;
    }

    @Override
    public void language() {
        System.out.println("In Russian and English");
    }
}
