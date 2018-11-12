import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class e03TicTacToe {
    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }
    public static String ticTacResult(String filename) {
        try {
            Path filepath = Paths.get(filename);
            List<String> content = Files.readAllLines(filepath);
            for (int i = 0; i<content.size(); i++) {
                String row = content.get(i);
                if (row.equals("XXX")) {
                    return "X";
                } else if (row.equals("OOO")) {
                    return "O";
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cannot read file");
            return  null;
        }
        return  null;

    }
}
