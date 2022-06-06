package JavaBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGuests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double numberOfCakes = Math.ceil(numberOfGuests / 3.0);
        double numberOfEggs = numberOfGuests * 2.0;

        double totalPrice = numberOfCakes * 4.0 + numberOfEggs * 0.45;

        if (totalPrice <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", numberOfCakes, numberOfEggs);
            System.out.printf("He has %.2f lv. left.", budget - totalPrice);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", totalPrice - budget);
        }
    }
}
