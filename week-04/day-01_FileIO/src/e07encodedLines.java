import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class e07encodedLines {
    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt
        try {
            Path filePath = Paths.get("encoded-lines.txt");
            List<String> content = Files.readAllLines(filePath);
            System.out.println(String.join("\n", encoding(content)));
            Files.write(Paths.get("encoded-lines-write.txt"), encoding(content));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<String> encoding(List<String> content) {
        String line = "";
        List<String> decrypted = new ArrayList<>();
        for (String rows : content) {
            line = "";
            for (int i = 0; i < rows.length(); i++) {
                int ascii = (int)(rows.charAt(i));
                if (ascii != 32) {
                    ascii--;
                }
                line += Character.toString((char)ascii);
            }decrypted.add(line);
        }
        return decrypted;
    }
}
