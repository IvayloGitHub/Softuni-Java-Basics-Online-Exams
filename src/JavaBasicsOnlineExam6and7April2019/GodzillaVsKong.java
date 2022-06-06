package JavaBasicsOnlineExam6and7April2019;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetFim = Double.parseDouble(scanner.nextLine());
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        double priceForClothingOfOnePerson = Double.parseDouble(scanner.nextLine());

        double decor = budgetFim * 0.1;
        double totalPriceForClothing = numberOfPeople * priceForClothingOfOnePerson;

        if (numberOfPeople > 150) {
            totalPriceForClothing = totalPriceForClothing * 0.9;
        }

        double priceForDecorAndClothing = decor + totalPriceForClothing;

        if (priceForDecorAndClothing > budgetFim) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", priceForDecorAndClothing - budgetFim);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budgetFim - priceForDecorAndClothing);
        }
    }
}
