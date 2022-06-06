package JavaBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEasterBreads = Integer.parseInt(scanner.nextLine());
        String bestBakerName = "";
        int bestPoints = Integer.MIN_VALUE;

        while(numberOfEasterBreads > 0) {
            String nameOfBaker = scanner.nextLine();
            String command = scanner.nextLine();
            int currentPoints = 0;
            while(!command.equals("Stop")) {
                int points = Integer.parseInt(command);
                currentPoints += points;
                command = scanner.nextLine();
            }
            if (currentPoints > bestPoints) {
                bestPoints = currentPoints;
                bestBakerName = nameOfBaker;
            }
            System.out.printf("%s has %d points.%n", nameOfBaker, currentPoints);
            if (nameOfBaker.equals(bestBakerName)) {
                System.out.printf("%s is the new number 1!%n", nameOfBaker);
            }
            numberOfEasterBreads--;
        }
        System.out.printf("%s won competition with %d points!%n", bestBakerName, bestPoints);
    }
}
