import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class e08CharArrayToString {
//    Write a Stream Expression to concatenate a Character array to a string!
    public static void main(String[] args) {

        Character[] charArr = {'s', 't', 'u', 'p', 'i', 'd'};
        List<Character> charList = Arrays.asList(charArr);

        System.out.println(charList.stream()
                .map(i -> i.toString())
                .collect(Collectors.joining()));
    }
}
