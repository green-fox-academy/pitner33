import java.util.ArrayList;
import java.util.Scanner;
public class e19JosephusProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number, please... ");
        int num = scanner.nextInt();
        ArrayList<Integer> josephus = new ArrayList<>();
        ArrayList<Integer> josephusP = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            josephus.add(i);
        }

        while (josephus.size() > 1) {
            josephusP = new ArrayList<>();
            if (josephus.size() % 2 == 0) {
                for (int i = 0; i < josephus.size(); i += 2) {
                    josephusP.add(josephus.get(i));
                }
            }else {
                josephusP.add(josephus.get(josephus.size()-1));
                for (int i = 0; i < josephus.size() - 1; i += 2) {
                    josephusP.add(josephus.get(i));
                }
            }
            josephus = josephusP;
        }
        System.out.println(josephus);
    }
}
