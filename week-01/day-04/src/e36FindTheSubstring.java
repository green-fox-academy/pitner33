public class e36FindTheSubstring {
    public static void main(String[] args) {
        System.out.println(subStr("searching this is what I'm searching in", "searching"));
        System.out.println(subStr("this is what I'm searching in", "not"));
    }

    public static int subStr(String input, String q) {
        int counter = 0;
        int inputPosition = -1;
        for (int i = 0; i < input.length() - q.length(); i++) {
            counter = 0;
            if (q.charAt(0) == input.charAt(i)) {
                for (int j = 0; j < q.length(); j++) {
                    if (q.charAt(j) == input.charAt(j + i)) {
                        counter++;
                    }
                }
                if (counter == q.length()) {
                    inputPosition = i;
                    return inputPosition;
                }
            }
        }
        return inputPosition;
    }
}
