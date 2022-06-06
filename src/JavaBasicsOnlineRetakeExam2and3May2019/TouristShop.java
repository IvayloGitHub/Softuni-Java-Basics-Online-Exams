package JavaBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        double notEnough = 0.0;

        String command = scanner.nextLine();
        double totalPrice = 0.0;
        int countOfProducts = 0;

        while (!command.equals("Stop")) {
            double priceOfProduct = Double.parseDouble(scanner.nextLine());

            if ((countOfProducts + 1) % 3 == 0) {
                priceOfProduct = priceOfProduct / 2.0;
                if (priceOfProduct > budget) {
                    notEnough = priceOfProduct;
                    break;
                } else {
                    countOfProducts++;
                    totalPrice = totalPrice + priceOfProduct;
                    budget = budget - priceOfProduct;
                }
            } else {
                if (priceOfProduct > budget) {
                    notEnough = priceOfProduct;
                    break;
                } else {
                    countOfProducts++;
                    totalPrice = totalPrice + priceOfProduct;
                    budget = budget - priceOfProduct;
                }
            }
                command = scanner.nextLine();
        }

        if (command.equals("Stop")) {
            System.out.printf("You bought %d products for " +
                    "%.2f leva.",countOfProducts, totalPrice);
        } else {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", notEnough - budget);
        }
    }
}
