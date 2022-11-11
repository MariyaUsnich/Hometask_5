package Newsletter;

public class Ad extends Company {
    public Ad(){
        author = "";
    }
    public Ad(String _companyName) {
        author = _companyName;
    }

    public String toString() {
        return "Advertisement: " + author + " / " + super.section;
    }

}

