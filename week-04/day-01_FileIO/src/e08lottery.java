import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import  java.util.Map;
import java.util.Map.Entry;
import java.util.Comparator;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;


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

        Map<String, Integer> lotteryUnsorted= new HashMap<>();
        int count = 1;
        for (int i = 0; i < allLotteryNumber.size(); i++) {
            count = 1;
            for (int j = i+1; j < allLotteryNumber.size(); j++) {
                if (allLotteryNumber.get(i).equals(allLotteryNumber.get(j))) {
                    count++;
                    allLotteryNumber.remove(j);
                }
            }
            lotteryUnsorted.put(allLotteryNumber.get(i), count);
        }

        System.out.println(Arrays.asList(lotteryUnsorted));
        System.out.println(lotteryUnsorted.size());


        System.out.println(lotteryUnsorted.get("3").intValue());

        return  allLotteryNumber;



    }

}
