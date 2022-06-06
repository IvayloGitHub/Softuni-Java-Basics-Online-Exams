package JavaBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGuests = Integer.parseInt(scanner.nextLine());
        double priceForOneGuest = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double priceForCake = budget * 0.1;

        if (numberOfGuests >= 10 && numberOfGuests <= 15) {
            priceForOneGuest = priceForOneGuest * 0.85;
        } else if (numberOfGuests > 15 && numberOfGuests <= 20) {
            priceForOneGuest = priceForOneGuest * 0.8;
        } else if (numberOfGuests > 20) {
            priceForOneGuest = priceForOneGuest * 0.75;
        }

        double totalPrice = numberOfGuests * priceForOneGuest + priceForCake;

        if (totalPrice <= budget) {
            System.out.printf("It is party time! %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("No party! %.2f leva needed.", totalPrice - budget);
        }
    }
}
