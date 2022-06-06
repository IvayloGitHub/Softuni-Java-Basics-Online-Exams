package JavaBasicsOnlineExam6and7April2019;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        int numberOfTickets = 0;
        int other = 0;

        String command = scanner.nextLine();

        while(!command.equals("End")) {
            String purchase = command;
            int currentPrice = 0;
            if(purchase.length() > 8) {
                currentPrice = purchase.charAt(0) + purchase.charAt(1);
                if (currentPrice <= voucher) {
                    voucher -= currentPrice;
                    numberOfTickets++;
                } else {
                    break;
                }
            } else {
                currentPrice = purchase.charAt(0);
                if (currentPrice <= voucher) {
                    voucher -= currentPrice;
                    other++;
                } else {
                    break;
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(numberOfTickets);
        System.out.println(other);
    }
}
