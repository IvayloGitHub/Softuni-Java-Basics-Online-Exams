package JavaBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfFlourPerKg = Double.parseDouble(scanner.nextLine());
        double flourInKg = Double.parseDouble(scanner.nextLine());
        double sugarInKg = Double.parseDouble(scanner.nextLine());
        int numberOfEggshells = Integer.parseInt(scanner.nextLine());
        int packagesOfYeast = Integer.parseInt(scanner.nextLine());

        double priceOfSugarPerKg = priceOfFlourPerKg * 0.75;
        double priceOfEggshell = priceOfFlourPerKg * 1.1;
        double priceOfPackageOfYeast = priceOfSugarPerKg * 0.2;

        double totalPrice = flourInKg * priceOfFlourPerKg + sugarInKg * priceOfSugarPerKg
                + numberOfEggshells * priceOfEggshell + packagesOfYeast * priceOfPackageOfYeast;

        System.out.printf("%.2f", totalPrice);

    }
}
