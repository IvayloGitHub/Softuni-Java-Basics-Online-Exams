package JavaBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfAllEggs = Integer.parseInt(scanner.nextLine());
        int totalEggsSold = 0;

        String command = scanner.nextLine();
        while(!command.equals("Close")) {
            int eggs = Integer.parseInt(scanner.nextLine());
            if (command.equals("Buy")) {
                if(eggs > numberOfAllEggs) {
                    break;
                } else {
                    totalEggsSold += eggs;
                    numberOfAllEggs -= eggs;
                }
            } else if (command.equals("Fill")) {
                numberOfAllEggs += eggs;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", totalEggsSold);
        } else {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", numberOfAllEggs);
        }
    }
}
