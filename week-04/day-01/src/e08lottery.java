import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class e08lottery {
    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
        try {
            Path filePath = Paths.get("lottery.txt");
            List<String> content = Files.readAllLines(filePath);
            System.out.println(lottery(content));
            System.out.println(lottery(content).size());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> lottery(List<String> content) {
        List<String> allLotteryNumber = new ArrayList<>();
        String lotteryNumbers = "";
        for (String rows : content) {
            for (int i = 11; i < 16; i++) {
                lotteryNumbers = rows.split(";")[i];
//                System.out.println(lotteryNumbers);
                allLotteryNumber.add(lotteryNumbers);
            }
        }
        int[][] lotteryArray = new int[allLotteryNumber.size()][2];
        for (int i = 0; i < allLotteryNumber.size(); i++) {
            int count = 1;

            List<Map<String, Integer>> lotteryBigNumbers = new ArrayList<>();
            Map<String, Integer> lotteryNumberCounter= new HashMap<>();
            for (int j = i+1; j < allLotteryNumber.size(); j++) {
                if (allLotteryNumber.get(i).equals(allLotteryNumber.get(j))) {
                    count++;
                }

            }

        }
        return  allLotteryNumber;



    }

}
