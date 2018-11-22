package e03ImplementCharSequence;

public class Main {
    public static void main(String[] args) {
        Gnirts text = new Gnirts("example");

        System.out.println(text.length());
        System.out.println(text.charAt(3));
        System.out.println(text.subSequence(2,5));
//This excercise is a bullshit
    }
}
