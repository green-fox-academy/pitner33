import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class e04Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        try {
            Path filepath = Paths.get("duplicated-chars.txt");
            List<String> content = Files.readAllLines(filepath);
            System.out.println(decrypt(content));
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    private static String decrypt(List<String> content) {
        List<String> decrypted = new ArrayList<>();
        String line = "";
        for (String row : content) {
            for (int j = 0; j < row.length(); j += 2) {
                line += Character.toString(row.charAt(j));
            } line += "\n";
        }
        return line;
    }
}
