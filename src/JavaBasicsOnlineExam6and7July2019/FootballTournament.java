package JavaBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        int numberOfPlayedGames = Integer.parseInt(scanner.nextLine());
        int limit = numberOfPlayedGames;

        int win = 0;
        int draw = 0;
        int lose = 0;
        int points = 0;

      while(limit > 0) {
          String result = scanner.nextLine();
          switch (result) {
              case "W":
                  win++;
                  points += 3;
                  break;
              case"D":
                  draw++;
                  points++;
                  break;
              case "L":
                  lose++;
                  break;
          }
          limit--;
      }
        if (numberOfPlayedGames == 0) {
            System.out.printf("%s hasn't played any games during this season.", team);
        } else {
            System.out.printf("%s has won %d points during this season.%n", team, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", win);
            System.out.printf("## D: %d%n", draw);
            System.out.printf("## L: %d%n", lose);
            System.out.printf("Win rate: %.2f%%", (win/(numberOfPlayedGames * 1.0)) * 100);

        }
    }
}
