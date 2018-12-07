import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class e07StringStartsWith {
//    Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        System.out.println(jhg(cities, "A"));
    }

    public static List<String> jhg(List<String> inList, String str) {
        return inList.stream()
                .filter(i -> i.startsWith(str))
                .collect(Collectors.toList());

    }


}
