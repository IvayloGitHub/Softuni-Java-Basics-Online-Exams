package JavaBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfCompany = scanner.nextLine();
        int numberOfTicketsForAdults = Integer.parseInt(scanner.nextLine());
        int numberOfTicketsForKids = Integer.parseInt(scanner.nextLine());
        double netPriceOfTicketsForAdults = Double.parseDouble(scanner.nextLine());
        double taxForService = Double.parseDouble(scanner.nextLine());

        double priceForAdults = netPriceOfTicketsForAdults + taxForService;
        double priceForKids = netPriceOfTicketsForAdults * 0.3 + taxForService;

        double totalPriceOfTickets = (numberOfTicketsForAdults * priceForAdults
                + numberOfTicketsForKids * priceForKids) * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",
                nameOfCompany, totalPriceOfTickets);

    }
}
