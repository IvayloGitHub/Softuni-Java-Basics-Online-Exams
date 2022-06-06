package JavaBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfSeries = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int numberOfEpisodes = Integer.parseInt(scanner.nextLine());
        double minutesOfEpisode = Double.parseDouble(scanner.nextLine());

        double minutesOfEpisodeWithAd = minutesOfEpisode * 1.2;

        double totalTime = seasons * numberOfEpisodes * minutesOfEpisodeWithAd + seasons * 10;


        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",
                nameOfSeries, totalTime);
    }
}
