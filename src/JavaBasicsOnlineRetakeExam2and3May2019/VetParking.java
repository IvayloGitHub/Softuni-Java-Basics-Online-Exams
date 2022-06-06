package JavaBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int numberOfHours = Integer.parseInt(scanner.nextLine());
        double priceForDay = 0.0;
        double totalPrice = 0.0;

        for (int i = 1; i <= numberOfDays; i++) {
            for (int j = 1; j <= numberOfHours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    priceForDay = priceForDay + 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    priceForDay = priceForDay + 1.25;
                } else {
                    priceForDay = priceForDay + 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, priceForDay);
            totalPrice = totalPrice + priceForDay;
            priceForDay = 0.0;
        }
        System.out.printf("Total: %.2f leva", totalPrice);
    }
}
