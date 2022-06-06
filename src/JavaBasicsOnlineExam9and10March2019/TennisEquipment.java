package JavaBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerTennisRacket = Double.parseDouble(scanner.nextLine());
        int numberOfTennisRackets = Integer.parseInt(scanner.nextLine());
        int numberOfPairOfTrainers = Integer.parseInt(scanner.nextLine());

        double pricePerPairOfTrainers = pricePerTennisRacket / 6.0;
        double priceForTrainersAndTennisRackets = pricePerTennisRacket * numberOfTennisRackets +
                pricePerPairOfTrainers * numberOfPairOfTrainers;
        double priceForOtherStuff = priceForTrainersAndTennisRackets * 0.2;
        double totalPrice = priceForTrainersAndTennisRackets + priceForOtherStuff;

        double priceForNovak = Math.floor(totalPrice / 8);
        double priceForSponsors = Math.ceil((totalPrice * 7) / 8);

        System.out.printf("Price to be paid by Djokovic %.0f%n", priceForNovak);
        System.out.printf("Price to be paid by sponsors %.0f%n", priceForSponsors);
    }
}
