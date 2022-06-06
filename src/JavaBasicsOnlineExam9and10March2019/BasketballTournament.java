package JavaBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int wins = 0;
        int losses = 0;
        int totalGames = 0;


        while(!command.equals("End of tournaments")) {
            String nameOfTournament = command;
            int numberOfGames = Integer.parseInt(scanner.nextLine());

            for(int i = 1; i <= numberOfGames; i++) {
                int pointsOfDesiTeam = Integer.parseInt(scanner.nextLine());
                int pointsOfSecondTeam = Integer.parseInt(scanner.nextLine());

                if (pointsOfDesiTeam > pointsOfSecondTeam) {
                    wins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n",
                            i, nameOfTournament, pointsOfDesiTeam - pointsOfSecondTeam);
                } else {
                    losses++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n",
                            i, nameOfTournament, pointsOfSecondTeam - pointsOfDesiTeam);
                }

            }
            totalGames += numberOfGames;
            command = scanner.nextLine();
        }
        double percentageOfWins = ((wins * 1.0) / totalGames) * 100;
        double percentageOfLosses = ((losses * 1.0) / totalGames) * 100;

        System.out.printf("%.2f%% matches win%n", percentageOfWins);
        System.out.printf("%.2f%% matches lost%n", percentageOfLosses);

    }
}
