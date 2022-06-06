package JavaBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournament = Integer.parseInt(scanner.nextLine());
        double limit = numberOfTournament;
        int numberOfPointsAtTheBeginning = Integer.parseInt(scanner.nextLine());

        int wins = 0;
        int finals = 0;
        int semiFinals = 0;
        int totalPoints = 0;

        while(numberOfTournament > 0) {
            String reachedStage = scanner.nextLine();

            switch (reachedStage) {
                case "W":
                    wins++;
                    break;
                case "F":
                    finals++;
                    break;
                case "SF":
                    semiFinals++;
                    break;
                default:
                    break;
            }
            numberOfTournament--;
        }

        totalPoints = numberOfPointsAtTheBeginning + wins * 2000 + finals * 1200 + semiFinals * 720;
        double averagePointsFromTournament = Math.floor((wins * 2000 + finals * 1200 + semiFinals * 720) / limit);
        double percentageOfWonTournaments = (wins/ limit) * 100;

        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %.0f%n", averagePointsFromTournament);
        System.out.printf("%.2f%%%n", percentageOfWonTournaments);
    }
}
