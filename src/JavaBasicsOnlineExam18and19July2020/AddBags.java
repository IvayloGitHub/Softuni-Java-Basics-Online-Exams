package JavaBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfBaggageOver20Kg = Double.parseDouble(scanner.nextLine());
        double baggageKg = Double.parseDouble(scanner.nextLine());
        int daysToJourney = Integer.parseInt(scanner.nextLine());
        int numberOfBaggage = Integer.parseInt(scanner.nextLine());
        double priceOfBaggage  = 0.0;

        if (baggageKg < 10) {
            priceOfBaggage = priceOfBaggageOver20Kg * 0.2;
        } else if (baggageKg <= 20) {
            priceOfBaggage = priceOfBaggageOver20Kg * 0.5;
        } else if (baggageKg > 20) {
            priceOfBaggage = priceOfBaggageOver20Kg;
        }

        if (daysToJourney < 7) {
            priceOfBaggage *= 1.4;
        } else if (daysToJourney <=30) {
            priceOfBaggage *= 1.15;
        } else {
            priceOfBaggage *= 1.1;
        }

        System.out.printf("The total price of bags is: %.2f lv.", numberOfBaggage * priceOfBaggage);
    }
}
