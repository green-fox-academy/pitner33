public class excersise11 {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a);
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e = e * e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean fbigger = f1 > f2;
        System.out.println(fbigger);

        int g1 = 350;
        int g2 = 200;
        boolean gbigger = (g2 * 2 > g1);
        System.out.println(gbigger);

        int h = 135798745;
        boolean divisior = (h % 11 ==0);
        System.out.println(divisior);

        int i1 = 10;
        int i2 = 3;
        boolean and = (i1 > i2 * i2) && (i1 < i2 * i2 * i2);
        System.out.println(and);

        int j = 1521;
        boolean or = (j % 3 == 0) || (j % 5 == 0);
        System.out.println(or);

        String k = "Apple";
        for (int i = 1; i < 4 ; i++) {
            k = k + "Apple";
        }
        System.out.println(k);




    }
}
