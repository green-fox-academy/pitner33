import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e00MaterialReview {
    public static void main(String[] args) {
        Path filePath = Paths.get("./hello.txt");

        String input = "More Hellos";
        List<String> inputList = new ArrayList<>(Arrays.asList("Hello2 Hello3"));
        //Files.write(filePath, input); ey hibas mert list kell neki nem sima string
        try {
            Files.write(filePath, inputList);
        } catch (Exception e){
            System.out.println("writing is messy");
        }
        try {
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines);
        } catch ( IOException exception) {
            exception.printStackTrace();
            System.out.println("File cannot be found");
        } catch (NullPointerException exception) {
            System.out.println("Null pointer error occured");
            exception.printStackTrace();
        } catch (Exception exception) {
            System.out.println("An error ocured");
            exception.printStackTrace();
        } finally {
            System.out.println("This block finally happened");
        }

    }
}
//Complie tim error- anything prevents your code to start Could be a syntax err or else
//Runtime error - ?
//Syntax err - syntax errors in the code
//Semantic err - smaller error - your code is running, but it does't do what you want - basically it's a logical error
//Exceptions - IO, NullPointer, etc.
//finally - at the end of try catch, this thing happens all the time - it always runs at the end of try-catch
//yuo can close a scanner here or smthg