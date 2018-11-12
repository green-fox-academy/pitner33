import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class e06ReversedOrder {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt

        try {
            Path filepath = Paths.get("reversed-order.txt");
            List<String> content = Files.readAllLines(filepath);
            Files.write(Paths.get("reversed-order-write.txt"), reverseOrder(content));
            System.out.println(String.join("\n", reverseOrder(content)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> reverseOrder(List<String> content) {
        List<String> reversedArray = new ArrayList<>();
        for (int i = (content.size() - 1); i >= 0 ; i--) {
            reversedArray.add(content.get(i));

        }
        return  reversedArray;
    }
}
