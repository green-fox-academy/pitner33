public class e15Colors {
    public static void main(String[] args) {
        String[][] shades = new String[3][];
        String[] green = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] red = {"orange red", "red", "tomato"};
        String[] pink = {"orchid", "violet", "pink", "hot pink"};
        shades[0] = green;
        shades[1] = red;
        shades[2] = pink;

        for (int i = 0; i < shades.length; i++) {
            for (int j = 0; j < shades[i].length; j++){
                System.out.print(shades[i][j] + ", ");
            }
            System.out.println(" ");

        }


    }
}
