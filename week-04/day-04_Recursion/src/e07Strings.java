public class e07Strings {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    public static void main(String[] args) {
        System.out.println(strings("text merry xmas dear x-men"));


    }
    public static String strings(String text) {
        if (text.isEmpty()) {
            return "";
        }else if (text.charAt(0) == 'x') {
            return 'y' + strings(text.substring(1));
        } else {
            return text.charAt(0) + strings(text.substring(1));
        }

    }
}
