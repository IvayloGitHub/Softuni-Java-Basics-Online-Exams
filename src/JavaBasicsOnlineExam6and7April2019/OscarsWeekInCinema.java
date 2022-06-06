package JavaBasicsOnlineExam6and7April2019;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfMovie = scanner.nextLine();
        String typeOfHall = scanner.nextLine();
        int numberOfTickets = Integer.parseInt(scanner.nextLine());

        double totalIncome = 0.0;

        switch (nameOfMovie) {
            case "A Star Is Born":
                switch (typeOfHall) {
                    case "normal":
                        totalIncome = numberOfTickets * 7.5;
                        break;
                    case "luxury":
                        totalIncome = numberOfTickets * 10.5;
                        break;
                    case "ultra luxury":
                        totalIncome = numberOfTickets * 13.5;
                        break;
                }
                break;
            case "Bohemian Rhapsody":
                switch (typeOfHall) {
                    case "normal":
                        totalIncome = numberOfTickets * 7.35;
                        break;
                    case "luxury":
                        totalIncome = numberOfTickets * 9.45;
                        break;
                    case "ultra luxury":
                        totalIncome = numberOfTickets * 12.75;
                        break;
                }
                break;
            case "Green Book":
                switch (typeOfHall) {
                    case "normal":
                        totalIncome = numberOfTickets * 8.15;
                        break;
                    case "luxury":
                        totalIncome = numberOfTickets * 10.25;
                        break;
                    case "ultra luxury":
                        totalIncome = numberOfTickets * 13.25;
                        break;
                }
                break;
            case "The Favourite":
                switch (typeOfHall) {
                    case "normal":
                        totalIncome = numberOfTickets * 8.75;
                        break;
                    case "luxury":
                        totalIncome = numberOfTickets * 11.55;
                        break;
                    case "ultra luxury":
                        totalIncome = numberOfTickets * 13.95;
                        break;
                }
                break;
            default:
                break;
        }
        System.out.printf("%s -> %.2f lv.", nameOfMovie, totalIncome);

    }
}
