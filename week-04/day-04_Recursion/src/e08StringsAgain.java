public class e08StringsAgain {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    public static void main(String[] args) {
        System.out.println(stringsAgain("text merry xmas dear x-men"));

    }
    public static String stringsAgain(String text) {
        if (text.isEmpty()) {
            return "";
        }else if (text.charAt(0) == 'x') {
            return stringsAgain(text.substring(1));
        } else {
            return text.charAt(0) + stringsAgain(text.substring(1));
        }

    }
}
