package e14Blog;

import java.util.ArrayList;
import java.util.List;

/*Create a Blog class which can
        store a list of BlogPosts
        add BlogPosts to the list
        delete(int) one item at given index
        update(int, BlogPost) one item at the given index and update it with another BlogPost*/
public class Blog {
    List<BlogPost> blog;

    public Blog() {
        this.blog = new ArrayList<>();
    }

    public void addBlogPost(BlogPost blogPost) {
        blog.add(blogPost);
    }

    public void delete(int num) {
        blog.remove(num-1);
    }

    public void update(int num, BlogPost blogPost) {
        blog.set(num-1, blogPost);
    }
}
