package JavaBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double litresOfFuel = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double totalFuel = litresOfFuel * 2.1;
        double totalPrice = totalFuel + 100;

        if (dayOfWeek.equals("Saturday")) {
            totalPrice = totalPrice * 0.9;
        } else if (dayOfWeek.equals("Sunday")) {
            totalPrice = totalPrice * 0.8;
        }

        if (budget >= totalPrice) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", totalPrice - budget);
        }
    }
}
