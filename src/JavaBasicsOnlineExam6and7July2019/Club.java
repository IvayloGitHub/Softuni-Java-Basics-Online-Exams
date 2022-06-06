package JavaBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededProfit = Double.parseDouble(scanner.nextLine());
        double clubIncome = 0.0;

        String command = scanner.nextLine();

        while(!command.equals("Party!")) {
        String nameOfDrink = command;
        int numberOfDrinks = Integer.parseInt(scanner.nextLine());

        int priceOfDrink = nameOfDrink.length();
        int order = numberOfDrinks * priceOfDrink;
        double orderInDouble = order;
        if (order % 2 != 0) {
            orderInDouble = order * 0.75;
        }
        clubIncome += orderInDouble;
        if(clubIncome >= neededProfit) {

            break;
        }

        command = scanner.nextLine();
        }
        if (neededProfit > clubIncome) {
            System.out.printf( "We need %.2f leva more.%n", neededProfit - clubIncome);
        } else {
            System.out.println("Target acquired.");
        }
        System.out.printf("Club income - %.2f leva.", clubIncome);
    }
}
