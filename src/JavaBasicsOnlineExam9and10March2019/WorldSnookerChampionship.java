package JavaBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stageOfChampionship = scanner.nextLine();
        String typeOfTicket = scanner.nextLine();
        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        char picture = scanner.next().charAt(0);
        double totalPrice = 0.0;

        switch (typeOfTicket) {
            case "Standard":
                switch (stageOfChampionship){
                    case "Quarter final":
                        totalPrice = totalPrice + numberOfTickets * 55.5;
                        break;
                    case "Semi final":
                        totalPrice = totalPrice + numberOfTickets * 75.88;
                        break;
                    case "Final":
                        totalPrice = totalPrice + numberOfTickets * 110.10;
                        break;
                    default:
                        break;
                }
                break;
            case "Premium":
                switch (stageOfChampionship){
                    case "Quarter final":
                        totalPrice = totalPrice + numberOfTickets * 105.20;
                        break;
                    case "Semi final":
                        totalPrice = totalPrice + numberOfTickets * 125.22;
                        break;
                    case "Final":
                        totalPrice = totalPrice + numberOfTickets * 160.66;
                        break;
                    default:
                        break;
                }
                break;
            case "VIP":
                switch (stageOfChampionship){
                    case "Quarter final":
                        totalPrice = totalPrice + numberOfTickets * 118.90;
                        break;
                    case "Semi final":
                        totalPrice = totalPrice + numberOfTickets * 300.40;
                        break;
                    case "Final":
                        totalPrice = totalPrice + numberOfTickets * 400;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        if (totalPrice <= 2500 && picture == 'Y') {
            totalPrice = totalPrice + numberOfTickets * 40;
        } else if (totalPrice <= 2500 && picture == 'N') {
            totalPrice = totalPrice + 0;
        } else if (totalPrice <= 4000 && picture == 'Y'){
            totalPrice = totalPrice * 0.9 + numberOfTickets * 40;
        } else if (totalPrice <= 4000 && picture == 'N') {
            totalPrice = totalPrice * 0.9;
        } else {
            totalPrice = totalPrice * 0.75;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
