import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class e03FindSquareBiggerThan20 {
//    Write a Stream Expression to find which number squared value is more then 20 from the following list:
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        System.out.println(numbers.stream()
                .map(i -> i * i)
                .filter(i -> i > 20)
                .collect(Collectors.toList()));

    }
}
