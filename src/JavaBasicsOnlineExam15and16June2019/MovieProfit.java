package JavaBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfMovie = scanner.nextLine();
        int daysForDisplay = Integer.parseInt(scanner.nextLine());
        int numberOfTicketsPerDay = Integer.parseInt(scanner.nextLine());
        double priceOfTicket = Double.parseDouble(scanner.nextLine());
        int percentageForCinema = Integer.parseInt(scanner.nextLine());

        double priceForTicketsPerDay = numberOfTicketsPerDay * priceOfTicket;
        double profitCommon = priceForTicketsPerDay * daysForDisplay;
        double profitForCinema = profitCommon * (percentageForCinema/100.00);
        double profitOfStudio = profitCommon - profitForCinema;

        System.out.printf("The profit from the movie %s is %.2f lv.", nameOfMovie, profitOfStudio);
    }
}
