package JavaBasicsOnlineExam6and7April2019;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        while(!command.equals("Finish")) {
            String nameOfMovie = command;
            int freeSpaces = Integer.parseInt(scanner.nextLine());
            double totalFreeSpaces = freeSpaces;
            int currentMovieSoldTicketCount = 0;
            String limit = scanner.nextLine();
            while(!limit.equals("End")) {
                String typeOfTicket = limit;

                switch (typeOfTicket) {
                    case "student":
                        studentTickets++;
                        currentMovieSoldTicketCount++;
                        break;
                    case "standard":
                        standardTickets++;
                        currentMovieSoldTicketCount++;
                        break;
                    case "kid":
                        kidTickets++;
                        currentMovieSoldTicketCount++;
                        break;
                }
                freeSpaces--;
                if(freeSpaces < 1) {
                    break;
                }
                limit = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", nameOfMovie, (currentMovieSoldTicketCount/totalFreeSpaces) * 100);
            command= scanner.nextLine();
        }
        double totalTickets = studentTickets + standardTickets + kidTickets;
        System.out.printf("Total tickets: %.0f%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (studentTickets/totalTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n", (standardTickets/totalTickets) * 100);
        System.out.printf("%.2f%% kids tickets.%n", (kidTickets/totalTickets) * 100);
    }
}
