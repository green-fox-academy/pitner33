import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class p03countLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Filename? ");
        String fileName = scanner.nextLine();
        System.out.println("The number of lines in it: " + numberOfLines(fileName));
    }
    public static int numberOfLines(String name) {
        try {
            Path filePath = Paths.get(name);
            List<String> allLines = Files.readAllLines(filePath);
            int numOfLines = allLines.size();
            return numOfLines;
        } catch (Exception e) {
            return 0;
        }
    }
}
