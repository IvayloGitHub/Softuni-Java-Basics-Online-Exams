package JavaBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCustomers = Integer.parseInt(scanner.nextLine());
        int limit = numberOfCustomers;
        double totalSpendMoney = 0.0;

        while (numberOfCustomers > 0) {
            String command = scanner.nextLine();
            int currentProductsCount = 0;
            double currentCustomerBill = 0.0;
            while(!command.equals("Finish")) {
                String nameOfProduct = command;
                switch (nameOfProduct) {
                    case "basket":
                        currentProductsCount++;
                        currentCustomerBill = currentCustomerBill + 1.5;
                        break;
                    case "wreath":
                        currentProductsCount++;
                        currentCustomerBill = currentCustomerBill + 3.8;
                        break;
                    case "chocolate bunny":
                        currentProductsCount++;
                        currentCustomerBill = currentCustomerBill + 7;
                        break;
                    default:
                        break;
                }

                command = scanner.nextLine();
            }

            if (currentProductsCount % 2 == 0) {
                currentCustomerBill = currentCustomerBill * 0.8;
            }
            totalSpendMoney = totalSpendMoney + currentCustomerBill;

            System.out.printf("You purchased %d items for %.2f leva.%n",
                    currentProductsCount, currentCustomerBill);

            numberOfCustomers--;
        }
        double averageBillPerClient = totalSpendMoney / limit;
        System.out.printf("Average bill per client is: %.2f leva.%n", averageBillPerClient);
    }
}
