public class excersise05 {
    public static void main(String[] args) {
        int a = 13;
        int b = 22;

        //add
        int add = a + b;
        System.out.println(add);

        //substract
        int substract = b - a;
        System.out.println(substract);

        //multiply
        int multiply = a * b;
        System.out.println(multiply);

        //divide
        float divide = (float) b / a;
        System.out.println(divide);

        //divide integer part
        int integerPart = b / a;
        System.out.println(integerPart);

        //divide remaining part
        int remainingPart = b % a;
        System.out.println(remainingPart);

    }
}
