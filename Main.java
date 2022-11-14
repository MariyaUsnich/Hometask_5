import Newsletter.*;


public class Main {

    public static void main(String[] args) {
        Article[] articles = new Article[8];
        try {
            articles[0].toString();
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("___NEWSLETTER CONTENT___");
        articles[0] = new Event("Name1", "Author1");
        articles[1] = new Event("Name2", "Author1");
        articles[2] = new Expert("Name3", "Author2");
        articles[3] = new Expert("Name4", "Author3");
        articles[4] = new Article("Name5", "Author1");
        articles[5] = new Company("Name6", "Company1");
        articles[6] = new Company("Name7", "Company2");
        articles[7] = new Ad("Company2");
        for (Article article : articles) {
            System.out.print(article.toString());
            System.out.println();
            article.language();
            System.out.println();
        }
        /*
         ArrayList<Article> alArticles = new ArrayList<>();
        alArticles.add(new Event("Name1", "Author1"));
        alArticles.add(new Event("Name2", "Author1"));
        alArticles.add(new Expert("Name3", "Author2"));
        alArticles.add(new Expert("Name4", "Author3"));
        alArticles.add(new Article("Name5", "Author1"));
        alArticles.add(new Company("Name6", "Company1"));
        alArticles.add(new Company("Name7", "Company2"));
        alArticles.add(new Ad("Company2"));

        for (Article article : alArticles) {
                System.out.print(article.toString());
                System.out.println();
                article.language();
                System.out.println();*/
        try {
            articles[10].language();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("-----------------------------------------------");
        while (true) {
            Article newarticle = new Article();
            newarticle.setName();
            newarticle.setAuthor();
            System.out.println(newarticle.toString());
            System.out.println("Needs editing: " + newarticle.Edit());
            if(newarticle.getName().isEmpty()) break;
        }
    }
}

