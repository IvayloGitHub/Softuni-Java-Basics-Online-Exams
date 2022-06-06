package JavaBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = 3;
        int wins = 0;
        int losses = 0;
        int draws = 0;

        while (limit > 0) {
            String match = scanner.nextLine();
            int firstChar = match.charAt(0);
            int lastChar = match.charAt(2);

            if (firstChar > lastChar) {
                wins++;
            } else if (lastChar > firstChar) {
                losses++;
            } else {
                draws++;
            }

            limit--;
        }
        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", losses);
        System.out.printf("Drawn games: %d%n", draws);
    }
}
