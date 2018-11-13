package e01postIt;

public class Main {
    public static void main(String[] args) {
        PostIt p1 = new PostIt();
        p1.color = "Blue";
        p1.backgrounColor = "Orange";
        p1.text = "Idea 1";

        PostIt p2 = new PostIt();
        p2.color = "Black";
        p2.backgrounColor = "Pink";
        p2.text = "Awsome";

        PostIt p3 = new PostIt();
        p3.color = "Green";
        p3.backgrounColor = "Yellow";
        p3.text = "Superb";
    }
}
