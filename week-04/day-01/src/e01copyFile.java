import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class e01copyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        Scanner scanner = new Scanner(System.in);
        System.out.println("Path and name of the file to copy? ");
        String nameCopy = scanner.nextLine();
        System.out.println("Path and name of the destination file? ");
        String nameDest = scanner.nextLine();

        System.out.println(copyFile(nameCopy, nameDest));
    }

    private static boolean copyFile(String nameCopy, String nameDest) {
        try {
            Path copyFrom = Paths.get(nameCopy);
            List<String> content = Files.readAllLines(copyFrom);
            Files.write(Paths.get(nameDest), content);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;

        }

    }
}
