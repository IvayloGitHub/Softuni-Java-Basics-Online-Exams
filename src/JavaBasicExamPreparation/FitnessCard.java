package JavaBasicExamPreparation;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String nameOfSport = scanner.nextLine();
        double priceForSport = 0.0;


        if (gender.equals("m")) {
            switch (nameOfSport) {
                case "Gym":
                    priceForSport = 42;
                    break;
                case "Boxing":
                    priceForSport = 41;
                    break;
                case "Yoga":
                    priceForSport = 45;
                    break;
                case "Zumba":
                    priceForSport = 34;
                    break;
                case "Dances":
                    priceForSport = 51;
                    break;
                case "Pilates":
                    priceForSport = 39;
                    break;
            }

        } else {
            switch(nameOfSport) {
                case "Gym":
                    priceForSport = 35;
                    break;
                case "Boxing":
                    priceForSport = 37;
                    break;
                case "Yoga":
                    priceForSport = 42;
                    break;
                case "Zumba":
                    priceForSport = 31;
                    break;
                case "Dances":
                    priceForSport = 53;
                    break;
                case "Pilates":
                    priceForSport = 37;
                    break;
            }
        }

        if (age <= 19) {
            priceForSport = priceForSport * 0.8;
        }

        if (sum >= priceForSport) {
            System.out.printf("You purchased a 1 month pass for %s.", nameOfSport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", priceForSport - sum);
        }
    }
}
