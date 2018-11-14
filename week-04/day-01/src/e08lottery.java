import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class e08lottery {
    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
        try {
            Path filePath = Paths.get("lottery.txt");
            List<String> content = Files.readAllLines(filePath);
            System.out.println(lottery(content));

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

        return  allLotteryNumber;


    }
//    az 5 leggyakoribbhoz. dupla fori ami ha egyezést talál count++, ezután az i-diket beteszi egy új tömbbe, a count-al együtt
//    ?? 2 dimenziós tömb? mérete az eredeti lista size ill 2
//    az i ugik egyet, count nulláz, ha egyezést talál count++ és az új listába legelőre teszi, ha a countja nagyobb, mint az aktuális első ott
//    így mindig a legnagyobb count-ú lesz elöl, [szám][count] formában
//    ezután csak ki kell nyomtatni a multitömb első 5 elemét
}
