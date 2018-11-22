package e05Counter;

public class Main {
    public static void main(String[] args) {
        Counter first = new Counter();
        first.add(5);
        System.out.println(first.get());
        first.add(6);
        System.out.println(first.get());
        first.add();
        System.out.println(first.get());
        first.reset();
        System.out.println(first.get());
    }
}
