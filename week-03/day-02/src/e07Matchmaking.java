import java.util.ArrayList;
import java.util.Arrays;

public class e07Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
    public static  ArrayList<String> makingMatches(ArrayList<String> a, ArrayList<String> b) {
        ArrayList<String> mixedList = new ArrayList<>();
        if (b.size() > a.size()){
            for (int i = 0; i < b.size() ; i++) {
                mixedList.add(b.get(i));
                if (i < a.size()) {
                    mixedList.add(a.get(i));
                }
            }
        } else for (int i = 0; i < a.size() ; i++) {
                mixedList.add(a.get(i));
                if (i < b.size()) {
                    mixedList.add(b.get(i));
                }
        }
        return  mixedList;





       /* if (a.size() > b.size()) {
            for (int i = 0; i < a.size(); i++) {
                mixedList.add(2 * i, a.get(i));
            }
            for (int j = 0; j < b.size(); j++) {
                mixedList.add(2 * j + 1, b.get(j));
            }
        }else for (int i = 0; i < b.size(); i++) {
                mixedList.add(2 * i, b.get(i));
            }
            for (int j = 0; j < a.size(); j++) {
                mixedList.add(2 * j + 1, a.get(j));
            }


        return mixedList;*/
    }
}
