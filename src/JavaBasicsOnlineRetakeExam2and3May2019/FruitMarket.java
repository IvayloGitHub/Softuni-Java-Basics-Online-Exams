package JavaBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfStrawberries = Double.parseDouble(scanner.nextLine());
        double bananasInKg = Double.parseDouble(scanner.nextLine());
        double orangesInKg = Double.parseDouble(scanner.nextLine());
        double raspberriesInKg = Double.parseDouble(scanner.nextLine());
        double strawberriesInKg = Double.parseDouble(scanner.nextLine());

        double priceOfRaspberries = priceOfStrawberries / 2.0;
        double priceOfOranges = priceOfRaspberries * 0.6;
        double priceOfBananas = priceOfRaspberries * 0.2;

        double totalPrice = priceOfStrawberries * strawberriesInKg + priceOfBananas * bananasInKg
                + priceOfOranges * orangesInKg + priceOfRaspberries * raspberriesInKg;

        System.out.printf("%.2f", totalPrice);

    }
}
