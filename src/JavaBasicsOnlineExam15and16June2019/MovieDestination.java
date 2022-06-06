package JavaBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        double cost = 0.0;

        if (season.equals("Winter")) {
            switch (destination) {
                case "Dubai":
                    cost = (numberOfDays * 45000) * 0.7;
                    break;
                case "Sofia":
                    cost = (numberOfDays * 17000) * 1.25;
                    break;
                case "London":
                    cost = numberOfDays * 24000;
                    break;
                default:
                    break;
            }
        } else if (season.equals("Summer")) {
            switch (destination) {
                case "Dubai":
                    cost = (numberOfDays * 40000) * 0.7;
                    break;
                case "Sofia":
                    cost = (numberOfDays * 12500) * 1.25;
                    break;
                case "London":
                    cost = numberOfDays * 20250;
                    break;
                default:
                    break;
            }
        }
        if (movieBudget >= cost) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",
                    movieBudget - cost);
        } else {
            System.out.printf("The director needs %.2f leva more!", cost - movieBudget);
        }
    }
}
