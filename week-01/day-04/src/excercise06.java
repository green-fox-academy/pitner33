public class excercise06 {
    public static void main(String[] args) {
        int dailyCode = 6; //daily coding - hours
        int semester = 17; //semester lenght - weeks
        int workdays = 5; //workdays per week
        int averageWorkhours = 52; //avg work hours per week

        int totalDays = semester * workdays;
        int totalHours = totalDays * dailyCode;
        System.out.println(totalHours);

        int totalAverageHours = semester * averageWorkhours;
        float percentage = (float) totalHours / totalAverageHours * 100;
        System.out.println(percentage + "%");

    }
}
