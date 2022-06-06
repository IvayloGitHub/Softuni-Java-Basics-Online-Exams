package JavaBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEasterBreads = Integer.parseInt(scanner.nextLine());
        double totalSugarInGrams = 0.0;
        double totalFlourInGrams = 0.0;

        int bestSugarInGrams = Integer.MIN_VALUE;
        int bestFlourInGrams = Integer.MIN_VALUE;

        while(numberOfEasterBreads > 0) {
            int sugarInGrams = Integer.parseInt(scanner.nextLine());
            int flourInGrams = Integer.parseInt(scanner.nextLine());

            if (sugarInGrams > bestSugarInGrams){
                bestSugarInGrams = sugarInGrams;
            }

            if (flourInGrams > bestFlourInGrams) {
                bestFlourInGrams = flourInGrams;
            }

            totalSugarInGrams = totalSugarInGrams + sugarInGrams;
            totalFlourInGrams = totalFlourInGrams + flourInGrams;

            numberOfEasterBreads --;
        }

        double neededPackagesSugar = Math.ceil(totalSugarInGrams / 950);
        double neededPackagesFlour = Math.ceil(totalFlourInGrams / 750);

        System.out.printf("Sugar: %.0f%n", neededPackagesSugar);
        System.out.printf("Flour: %.0f%n", neededPackagesFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",
                bestFlourInGrams, bestSugarInGrams);

    }
}
