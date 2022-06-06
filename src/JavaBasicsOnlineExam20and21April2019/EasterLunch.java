package JavaBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakes = Integer.parseInt(scanner.nextLine());
        int eggshells = Integer.parseInt(scanner.nextLine());
        int cookiesInKg = Integer.parseInt(scanner.nextLine());


        double totalPrice = cakes * 3.20 + eggshells * 4.35 + eggshells * 12 * 0.15 + cookiesInKg * 5.40;

        System.out.printf("%.2f", totalPrice);
    }
}
