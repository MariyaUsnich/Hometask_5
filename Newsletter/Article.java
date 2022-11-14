package Newsletter;

import java.util.Objects;
import java.util.Scanner;

public class Article {

    public Article() {
        name = "";
        author = "";
    }

    public Article(String _name, String _author) {
        name = _name;
        author = _author;
    }

    public String toString() {
        return name + " " + author;
    }

    public void language() {
        System.out.println("In Russian");
    }

    public void setName() {
        System.out.print("Please enter the article name: ");
        this.name = new Scanner(System.in).nextLine();
    }

    public void setAuthor() {
        System.out.print("Please enter the article author: ");
        this.author = new Scanner(System.in).nextLine();
    }
    public boolean Edit() {
        return !author.equals("Author1");
        //return !Objects.equals(author, "Author1");
    }

    public String getName() {
        return name;
    }

    protected String name;
    protected String author;
}
