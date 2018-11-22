public class e19ReverseList {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
//        simple solution
//        for (int i = aj.length - 1; i >= 0; i--){

//        more lines solution
        for (int i = 0; i <= aj.length; i++) {
            int j = ((aj.length - 1) - i);
            System.out.print(aj[i] + " ");
        }
    }
}
