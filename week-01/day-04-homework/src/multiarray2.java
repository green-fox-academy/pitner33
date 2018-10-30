import java.util.Arrays;
public class multiarray2 {
    public static void main(String[] args) {

        String[][] multiArray = new String[10][10];
        for (int i = 0; i < multiArray.length; i++)
        {
            for (int j = 0; j < multiArray[i].length; j++)
            {
                multiArray[i][j] = i + " " + j;
            }
        }
        for (String[] rows : multiArray)
        {
            for (String column : rows)
            {
                System.out.print("| " + column + " ");
            }
            System.out.println("|");
        }
    }
}
