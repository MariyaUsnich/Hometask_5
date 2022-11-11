package Newsletter;

public class Expert extends Article {

    public Expert() {
        super();
    }

    public Expert(String _name, String _author) {
        super(_name, _author);
    }

    public String toString() {
        return "Article: " + super.toString() + " / " + section;
    }

    @Override
    public void language() {
        super.language();
        System.out.println("May be translated");
    }

    private final String section = "For_Business";


}
