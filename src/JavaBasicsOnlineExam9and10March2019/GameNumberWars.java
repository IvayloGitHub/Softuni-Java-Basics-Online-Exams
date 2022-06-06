package JavaBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfFirstPlayer = scanner.nextLine();
        String nameOfSecondPlayer = scanner.nextLine();
        int pointsOfFirstPlayer = 0;
        int pointsOfSecondPlayer = 0;
        int totalWinnerPoints = 0;
        String winner = "";

        String command = scanner.nextLine();

        while(!command.equals("End of game")) {
            int cardOfFirstPlayer = Integer.parseInt(command);
            int cardOfSecondPlayer = Integer.parseInt(scanner.nextLine());

            if (cardOfFirstPlayer > cardOfSecondPlayer) {
                pointsOfFirstPlayer = pointsOfFirstPlayer + cardOfFirstPlayer - cardOfSecondPlayer;
            } else if (cardOfSecondPlayer > cardOfFirstPlayer) {
                pointsOfSecondPlayer = pointsOfSecondPlayer + cardOfSecondPlayer - cardOfFirstPlayer;
            } else {
                cardOfFirstPlayer = Integer.parseInt(scanner.nextLine());
                cardOfSecondPlayer = Integer.parseInt(scanner.nextLine());
                if (cardOfFirstPlayer > cardOfSecondPlayer) {
                    winner = nameOfFirstPlayer;
                    totalWinnerPoints = pointsOfFirstPlayer;
                    break;
                } else if (cardOfSecondPlayer > cardOfFirstPlayer) {
                    winner = nameOfSecondPlayer;
                    totalWinnerPoints = pointsOfSecondPlayer;
                    break;
                }
            }
            command = scanner.nextLine();
        }
        if (command.equals("End of game")) {
            System.out.printf("%s has %d points%n", nameOfFirstPlayer, pointsOfFirstPlayer);
            System.out.printf("%s has %d points%n", nameOfSecondPlayer, pointsOfSecondPlayer);
        } else {
            System.out.println("Number wars!");
            System.out.printf("%s is winner with %d points", winner, totalWinnerPoints);
        }
    }
}
