package JavaBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfMovie = scanner.nextLine();
        String extras = scanner.nextLine();
        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        double bill = 0.0;
        switch (nameOfMovie) {
            case "John Wick":
                switch (extras) {
                    case "Drink":
                        bill = numberOfTickets * 12;
                        break;
                    case "Popcorn":
                        bill = numberOfTickets * 15;
                        break;
                    case "Menu":
                        bill = numberOfTickets * 19;
                        break;
                    default:
                        break;
                }
                break;
            case "Star Wars":
                switch (extras) {
                    case "Drink":
                        if (numberOfTickets >= 4) {
                        bill = (numberOfTickets * 18) * 0.7;
                        } else {
                            bill = numberOfTickets * 18;
                        }
                        break;
                    case "Popcorn":
                        if (numberOfTickets >= 4) {
                            bill = (numberOfTickets * 25) * 0.7;
                        } else {
                            bill = numberOfTickets * 25;
                        }
                        break;
                    case "Menu":
                        if (numberOfTickets >= 4) {
                            bill = (numberOfTickets * 30) * 0.7;
                        } else {
                            bill = numberOfTickets * 30;
                        }
                        break;
                    default:
                        break;
                }
                break;
            case "Jumanji":
                switch (extras) {
                    case "Drink":
                        if (numberOfTickets == 2) {
                            bill = (numberOfTickets * 9) * 0.85;
                        } else {
                            bill = numberOfTickets * 9;
                        }
                        break;
                    case "Popcorn":
                        if (numberOfTickets == 2) {
                            bill = (numberOfTickets * 11) * 0.85;
                        } else {
                            bill = numberOfTickets * 11;
                        }
                        break;
                    case "Menu":
                        if (numberOfTickets == 2) {
                            bill = (numberOfTickets * 14) * 0.85;
                        } else {
                            bill = numberOfTickets * 14;
                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        System.out.printf("Your bill is %.2f leva.", bill);
    }
}
