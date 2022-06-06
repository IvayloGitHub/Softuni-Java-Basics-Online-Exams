package JavaBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfPlayer = scanner.nextLine();
        int successfulShots = 0;
        int unsuccessfulShots = 0;

        String command = scanner.nextLine();

        int totalPoints = 301;

        while(!command.equals("Retire")) {
            String field = command;
            int points = Integer.parseInt(scanner.nextLine());

            if (field.equals("Double")) {
                points = points * 2;

            } else if (field.equals("Triple")) {
                points = points * 3;
            }

            if (totalPoints < points) {
                unsuccessfulShots++;
            } else if (totalPoints > points) {
                successfulShots++;
                totalPoints -= points;
            } else {
                successfulShots++;
                totalPoints -= points;
                break;
            }

            command = scanner.nextLine();
        }

        if (command.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.", nameOfPlayer, unsuccessfulShots);
        } else {
            System.out.printf("%s won the leg with %d shots.", nameOfPlayer, successfulShots);
        }
    }
}
