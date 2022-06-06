package JavaBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        double entrance = Double.parseDouble(scanner.nextLine());
        double deckChair = Double.parseDouble(scanner.nextLine());
        double umbrella = Double.parseDouble(scanner.nextLine());

        double numberOfUmbrellas = Math.ceil(numberOfPeople/2.0);
        double numberOfDeckChairs = Math.ceil(numberOfPeople * 0.75);

        double totalPrice = numberOfPeople * entrance + numberOfUmbrellas * umbrella
                + numberOfDeckChairs * deckChair;

        System.out.printf("%.2f lv.", totalPrice);
    }
}
