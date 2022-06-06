package JavaBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bestPoints = 0;
        String bestPlayer = "";

        String command = scanner.nextLine();

        while(!command.equals("Stop")) {
            int limit = command.length();

            int pointsForPlayer = 0;

            for (int i = 0; i < limit; i++) {
                int number = Integer.parseInt(scanner.nextLine());
                char letter = command.charAt(i);
                int guess = 0;
                guess = letter;
                if (number == guess) {
                    pointsForPlayer+= 10;
                } else {
                    pointsForPlayer += 2;
                }
                if (pointsForPlayer >= bestPoints) {
                    bestPoints = pointsForPlayer;
                    bestPlayer = command;
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", bestPlayer, bestPoints);
    }
}
