package JavaBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double income = 0.0;

        while(!command.equals("ACTION")) {
            String nameOfActor = command;

            if (nameOfActor.length() > 15) {
                income = budget * 0.2;
            } else {
                income = Double.parseDouble(scanner.nextLine());
            }
            if (budget > income) {
                budget = budget - income;
            } else {
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("ACTION")) {
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", income - budget);
        }
    }
}
