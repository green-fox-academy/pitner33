import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class e02Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.
        List<String> logContent = new ArrayList<>();
        try {
            Path log = Paths.get("./log.txt");
            logContent = Files.readAllLines(log);

        } catch (IOException e) {
            System.out.println("Cannot read file");
            e.printStackTrace();
        }
        System.out.println(String.join("\n", uniqueIP(logContent)));
        System.out.println(ratio(logContent));
    }
    public static List<String> uniqueIP(List<String> logContent) {
        List<String> IP = new ArrayList<>();
        for (int i = 0; i < logContent.size(); i++) {
            String oneIP = logContent.get(i).split("\\s+")[5];
            if (!IP.contains(oneIP)) {
                IP.add(oneIP);
            }
        }
        return IP;
    }

    public static double ratio(List<String> logContent) {
        double get = 0;
        double post = 0;
        for (int i = 0; i < logContent.size(); i++) {
            String oneIP = logContent.get(i).split("\\s+")[6];
            if (oneIP.equals("GET")) {
                get++;
            } else post++;
        }
        return get/post;
    }
}
