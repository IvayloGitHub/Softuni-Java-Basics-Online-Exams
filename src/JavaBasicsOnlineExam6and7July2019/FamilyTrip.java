package JavaBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        double pricePerDay = Double.parseDouble(scanner.nextLine());
        int percentOfAdditionalCosts = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

        if (numberOfDays <= 7) {
            totalPrice = numberOfDays * pricePerDay + budget * (percentOfAdditionalCosts/100.00) ;
        } else {
            totalPrice = (numberOfDays * pricePerDay) * 0.95 + budget * (percentOfAdditionalCosts/100.00);
        }

        if (budget >= totalPrice) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalPrice);
        } else {
            System.out.printf("%.2f leva needed.", totalPrice - budget);
        }
    }
}
