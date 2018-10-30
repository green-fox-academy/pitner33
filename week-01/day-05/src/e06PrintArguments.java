import java.util.Scanner;
public class e06PrintArguments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //        skipped, suggested by Mentors
        printParams("first");
        printParams("first", "second");
        printParams("first", "second", "third", "fourh");


    }
    public static void printParams(String... first) {
        for (int i = 0; i < first.length; i++) {
            System.out.println(first[i] + " ");
        }
        System.out.println("\n");
    }


}
