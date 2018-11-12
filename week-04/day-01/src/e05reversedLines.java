import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class e05reversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        try {
            Path filepath = Paths.get("reversed-lines.txt");
            List<String> content = Files.readAllLines(filepath);
            Files.write(Paths.get("reverse-write.txt"), reverse(content));
            System.out.println(reverse(content));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static List<String> reverse(List<String> content) {
        String line = "";
        List<String> reverseArray = new ArrayList<>();
        for (String row : content) {
            line = "";
            for (int j = (row.length()-1); j >= 0; j--) {
                line += Character.toString(row.charAt(j));
            } reverseArray.add(line);
        }
        return reverseArray;
    }
}
