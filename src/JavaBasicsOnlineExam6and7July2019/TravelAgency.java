package JavaBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String options = scanner.nextLine();
        String VIP = scanner.nextLine();
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

        if (numberOfDays < 1) {
            System.out.println("Days must be positive number!");
            return;
        }

        if (numberOfDays > 7) {
            numberOfDays--;
        }

        switch (town) {
            case "Bansko":
            case "Borovets":
                switch (options) {
                    case "withEquipment":
                        if(VIP.equals("yes")) {
                            totalPrice = (numberOfDays * 100) * 0.90;
                        } else {
                            totalPrice = numberOfDays * 100;
                        }
                        break;
                    case "noEquipment":
                        if(VIP.equals("yes")) {
                            totalPrice = (numberOfDays * 80) * 0.95;
                        } else {
                            totalPrice = numberOfDays * 80;
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;
                }
                break;
            case "Varna":
            case "Burgas":
                switch (options) {
                    case "withBreakfast":
                        if(VIP.equals("yes")) {
                            totalPrice = (numberOfDays * 130) * 0.88;
                        } else {
                            totalPrice = numberOfDays * 130;
                        }
                        break;
                    case "noBreakfast":
                        if(VIP.equals("yes")) {
                            totalPrice = (numberOfDays * 100) * 0.93;
                        } else {
                            totalPrice = numberOfDays * 100;
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;
                }
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
        if(totalPrice > 0) {
        System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
        }
    }
}
