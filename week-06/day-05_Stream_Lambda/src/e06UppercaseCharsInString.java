import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class e06UppercaseCharsInString {
//    Write a Stream Expression to find the uppercase characters in a string!

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



        List<Character> charArray = new ArrayList<>();

        for (int i = 0; i < text.length() ; i++) {
            charArray.add(text.charAt(i));
        }
        System.out.println(charArray);


        System.out.println(charArray.stream()
                .filter(c -> Character.isUpperCase(c))
                .collect(Collectors.toList()));





    }
}

