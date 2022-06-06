package JavaBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;

        switch (destination) {
            case "France":
                switch (dates) {
                    case "21-23":
                        totalPrice = numberOfDays * 30;
                        break;
                    case "24-27":
                        totalPrice = numberOfDays * 35;
                        break;
                    case "28-31":
                        totalPrice = numberOfDays * 40;
                        break;
                }
                break;
            case "Italy":
                switch (dates) {
                    case "21-23":
                        totalPrice = numberOfDays * 28;
                        break;
                    case "24-27":
                        totalPrice = numberOfDays * 32;
                        break;
                    case "28-31":
                        totalPrice = numberOfDays * 39;
                        break;
                }
                break;
            case "Germany":
                switch (dates) {
                    case "21-23":
                        totalPrice = numberOfDays * 32;
                        break;
                    case "24-27":
                        totalPrice = numberOfDays * 37;
                        break;
                    case "28-31":
                        totalPrice = numberOfDays * 43;
                        break;
                }
                break;
            default:
                break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalPrice);
    }
}
