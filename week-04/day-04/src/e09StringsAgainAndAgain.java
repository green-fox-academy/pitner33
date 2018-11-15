public class e09StringsAgainAndAgain {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
    public static void main(String[] args) {
        System.out.println(stringsAgainAndAgain("text merry xmas dear x-men"));

    }
    public static String stringsAgainAndAgain(String text) {
        if (text.isEmpty()) {
            return "";
        }else {
            return text.charAt(0) + "*" +  stringsAgainAndAgain(text.substring(1));
        }



    }
}
