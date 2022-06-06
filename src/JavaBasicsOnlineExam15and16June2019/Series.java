package JavaBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        int numberSeries = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;

        while(numberSeries > 0) {

            String nameOfSeries = scanner.nextLine();
            double priceOfSeries = Double.parseDouble(scanner.nextLine());
            switch (nameOfSeries) {
                case "Thrones":
                    totalPrice = totalPrice + priceOfSeries * 0.5;
                    break;
                case "Lucifer":
                    totalPrice = totalPrice + priceOfSeries * 0.6;
                    break;
                case "Protector":
                    totalPrice = totalPrice + priceOfSeries * 0.7;
                    break;
                case "TotalDrama":
                    totalPrice = totalPrice + priceOfSeries * 0.8;
                    break;
                case "Area":
                    totalPrice = totalPrice + priceOfSeries * 0.9;
                    break;
                default:
                    totalPrice = totalPrice + priceOfSeries;
                    break;
            }
            numberSeries--;
        }

        if (budget >= totalPrice) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - totalPrice);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", totalPrice - budget);
        }
    }
}
