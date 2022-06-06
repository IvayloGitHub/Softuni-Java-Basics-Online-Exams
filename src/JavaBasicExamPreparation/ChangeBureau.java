package JavaBasicExamPreparation;

import java.util.Scanner;

public class ChangeBureau {
    public ChangeBureau() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBitCoins = Integer.parseInt(scanner.nextLine());

        double numberOfYuan = Double.parseDouble(scanner.nextLine());

        double commission = Double.parseDouble(scanner.nextLine());
        double oneYuanInLeva = 0.264;
        double inEuroWithoutCommission = ((double)(numberOfBitCoins * 1168) + numberOfYuan * oneYuanInLeva) / 1.95;
        double inEuroWithCommission = inEuroWithoutCommission - commission / 100.0 * inEuroWithoutCommission;
        System.out.printf("%.2f", inEuroWithCommission);
    }
}