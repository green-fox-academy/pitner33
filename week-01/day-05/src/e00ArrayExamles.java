public class e00ArrayExamles {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        //type[] name = new type[numberOfElements]

        System.out.println(numbers.toString());
        System.out.println(numbers);
        System.out.println(numbers[0]);
        numbers[9] = 10;
        System.out.println(numbers.length);
        numbers[numbers.length - 1] = 100; //last element of array will be 100

        int[][] matrix;

        final int john = 2; //the john variable cannot be changed if final is there

        final boolean[] booleans = new boolean[2];
        booleans[0] = true; //you can change but why

    }
}
