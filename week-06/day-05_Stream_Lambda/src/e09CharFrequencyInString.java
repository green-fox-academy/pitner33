import java.util.ArrayList;
import java.util.List;

public class e09CharFrequencyInString {
//    Write a Stream Expression to find the frequency of characters in a given string!

    public static void main(String[] args) {
        String text = "Talán annak szerencsés véletlennek köszönhetem a digitális világ iránti érdeklődésemet, " +
                "hogy nagyjából egy időszakra esett a gyerekkorom és a rendszerváltás előtti évek egyre nyitottabb" +
                " világa. Ma is élénken emlékszem mekkora élmény volt az első Bécsben vásárolt kvarcjátékkal játszani " +
                "napestig, otthon, az általános iskolában, majd az osztálytársak közt kölcsön-csereberélni az űrhajós, " +
                "robotos, autóversenyes, focis – mai szemmel persze már végtelenül egyszerűnek tűnő – folyadékkristályos" +
                " kijelzős kütyüket. Az osztályban a legmenőbb srácnak Casio Western Bar játéka volt, az órák közti " +
                "szünetekben, délután a napköziben ő volt a kvarcjátéktőzsde ura, nekem legalább ötször oda kellett " +
                "adnom az én nem annyira menő Play & Time békás-elkapós játékomat (Frogs), hogy egyszer játszhassak " +
                "az övével.";

        List<Character> charArrayList = new ArrayList<>();

        for (int i = 0; i < text.length() ; i++) {
            charArrayList.add(text.charAt(i));
        }
        System.out.println(charArrayList);

        for (int i = 0; i < charArrayList.size(); i++) {
            System.out.print(text.charAt(i) + ": ");
            System.out.println(charArrayList.stream()
                    .filter(t -> t.equals(t))
                    .count());

        }

//STILL NOT OK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }
}
