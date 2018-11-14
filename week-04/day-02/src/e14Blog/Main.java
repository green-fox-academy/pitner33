package e14Blog;

public class Main {
    public static void main(String[] args) {

        Blog firstblog = new Blog();

        BlogPost firstPost = new BlogPost();
        BlogPost secondPost = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");

        firstblog.addBlogPost(new BlogPost());
        firstblog.addBlogPost(new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04."));
        firstblog.addBlogPost(secondPost);
        firstblog.addBlogPost(firstPost);

        for (int i = 0; i < firstblog.blog.size(); i++) {
            System.out.println(firstblog.blog.get(i).toString());
        }

        firstblog.delete(2);

        System.out.println("_______________________");

        for (int i = 0; i < firstblog.blog.size(); i++) {
            System.out.println(firstblog.blog.get(i).toString());
        }

        System.out.println("_______________________");

        firstblog.update(1, secondPost);

        for (int i = 0; i < firstblog.blog.size(); i++) {
            System.out.println(firstblog.blog.get(i).toString());
        }

    }
}
