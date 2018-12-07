import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class e04AverageOfOddNumbers {

//    Write a Stream Expression to get the average value of the odd numbers from the following list:
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        IntSummaryStatistics oddAverage = numbers.stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(i -> i)
                .summaryStatistics();

        System.out.println(oddAverage.getAverage());
}

}
