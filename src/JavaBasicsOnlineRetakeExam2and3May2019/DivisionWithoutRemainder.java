package JavaBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int howManyNumbersToCheck = Integer.parseInt(scanner.nextLine());
        double limit = 0.0;
        limit = howManyNumbersToCheck;
        int byTwoCount = 0;
        int byThreeCount = 0;
        int byFourCount = 0;


        while (howManyNumbersToCheck > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                byTwoCount++;

            }

            if (number % 3 == 0) {
                byThreeCount++;
            }

            if (number % 4 == 0) {
                byFourCount++;
            }

            howManyNumbersToCheck--;
        }
        System.out.printf("%.2f%%%n", (byTwoCount / limit) * 100);
        System.out.printf("%.2f%%%n", (byThreeCount / limit ) * 100);
        System.out.printf("%.2f%%%n", (byFourCount / limit) * 100);
    }
}
