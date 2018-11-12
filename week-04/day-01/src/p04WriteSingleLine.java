import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class p04WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        try {
            Path filePath = Paths.get("./my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            lines.add("Sol was here!");
            Files.write(filePath, lines);
            System.out.println(String.join("\n", lines));
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Unable to write: ./my-file.txt");
        }
    }
}
