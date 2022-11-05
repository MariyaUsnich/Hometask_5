package Newsletter;

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

    public boolean Edit() {
            System.out.print("Please enter the article name: ");
            name = new Scanner(System.in).nextLine();
            System.out.print("Please enter the article author: ");
            author = new Scanner(System.in).nextLine();
        return author != "Author1";
        }
    protected String name;
    protected String author;


}
