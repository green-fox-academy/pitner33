import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class e02SquareThePositive {
//    Write a Stream Expression to get the squared value of the positive numbers from the following list:

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        System.out.println(numbers.stream()
                .filter(i -> i > 0)
                .map(i -> (i*i))
                .collect(Collectors.toList()));
    }
}
