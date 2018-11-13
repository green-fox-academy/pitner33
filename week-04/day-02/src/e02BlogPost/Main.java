package e02BlogPost;
/*Create a few blog post objects:
        "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
        Lorem ipsum dolor sit amet.
        "Wait but why" titled by Tim Urban posted at "2010.10.10."
        A popular long-form, stick-figure-illustrated blog about almost everything.
        "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
        When I asked to take his picture outside one of IBM’s New York City offices, he told me that
        he wasn’t really into the whole organizer profile thing.*/
public class Main {
    public static void main(String[] args) {
        BlogPost book1 = new BlogPost();
        book1.title = "\"Lorem Ipsum\"";
        book1.authorName = "John Doe";
        book1.publicationDate = "\"2000.05.04\"";
        book1.text = "Lorem ipsum dolor sit amet.";

        System.out.println(book1.title + " titled by " + book1.authorName + " posted at " + book1.publicationDate);
        System.out.println(book1.text);


        BlogPost book2 = new BlogPost();
        book2.title = "\"Wait but why\"";
        book2.authorName = "Tim Urban";
        book2.publicationDate = "\"2010.10.10\"";
        book2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        System.out.println(book2.title + " titled by " + book2.authorName + " posted at " + book2.publicationDate);
        System.out.println(book2.text);

        BlogPost book3 = new BlogPost();
        book3.title = "\"One Engineer Is Trying to Get IBM to Reckon With Trump\"";
        book3.authorName = "William Turton";
        book3.publicationDate = "\"2017.03.28.\"";
        book3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

        System.out.println(book3.title + " titled by " + book3.authorName + " posted at " + book3.publicationDate);
        System.out.println(book3.text);
    }
}
