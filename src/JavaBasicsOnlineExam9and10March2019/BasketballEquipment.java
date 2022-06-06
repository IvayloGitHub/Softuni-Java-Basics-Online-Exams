package JavaBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());

        double priceForSneakers = yearTax * 0.6;
        double priceForOutfit = priceForSneakers * 0.8;
        double priceForBall = priceForOutfit / 4;
        double priceForAccessories = priceForBall / 5;

        double totalPrice = yearTax + priceForSneakers + priceForOutfit
                + priceForBall + priceForAccessories;

        System.out.printf("%.2f", totalPrice);

    }
}
