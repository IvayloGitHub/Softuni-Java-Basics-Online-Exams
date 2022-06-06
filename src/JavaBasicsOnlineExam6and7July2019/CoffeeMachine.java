package JavaBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDrink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numberOfDrinks = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

       switch (typeOfDrink) {
           case "Espresso":
               switch (sugar){
                   case "Without":
                       totalPrice = (numberOfDrinks * 0.90) * 0.65;
                       break;
                   case "Normal":
                       totalPrice = numberOfDrinks * 1.00;
                       break;
                   case "Extra":
                       totalPrice = numberOfDrinks * 1.20;
                       break;
               }
               if (numberOfDrinks >= 5) {
                   totalPrice *= 0.75;
               }
               if (totalPrice > 15.00) {
                   totalPrice *= 0.80;
               }
               break;
           case "Cappuccino":
               switch (sugar){
                   case "Without":
                       totalPrice = (numberOfDrinks * 1.00) * 0.65;
                       break;
                   case "Normal":
                       totalPrice = numberOfDrinks * 1.20;
                       break;
                   case "Extra":
                       totalPrice = numberOfDrinks * 1.60;
                       break;
               }
               if (totalPrice > 15.00) {
                   totalPrice *= 0.80;
               }
               break;
           case "Tea":
               switch (sugar){
                   case "Without":
                       totalPrice = (numberOfDrinks * 0.50) * 0.65;
                       break;
                   case "Normal":
                       totalPrice = numberOfDrinks * 0.60;
                       break;
                   case "Extra":
                       totalPrice = numberOfDrinks * 0.70;
                       break;
               }
               if (totalPrice > 15.00) {
                   totalPrice *= 0.80;
               }
               break;
           default:
               break;
       }
        System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, typeOfDrink, totalPrice);
    }
}
