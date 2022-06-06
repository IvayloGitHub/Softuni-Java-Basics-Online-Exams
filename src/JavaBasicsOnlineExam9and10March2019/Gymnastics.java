package JavaBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String typeOfPlay = scanner.nextLine();

        double totalScore = 0.0;

        switch (typeOfPlay) {
            case "ribbon":
                switch (country) {
                    case "Russia":
                        totalScore = 9.1 + 9.4;
                        break;
                    case "Bulgaria":
                        totalScore = 9.6 + 9.4;
                        break;
                    case "Italy":
                        totalScore = 9.2 + 9.5;
                        break;
                    default:
                        break;
                }
                break;
            case "hoop":
                switch (country) {
                    case "Russia":
                        totalScore = 9.3 + 9.8;
                        break;
                    case "Bulgaria":
                        totalScore = 9.550 + 9.75;
                        break;
                    case "Italy":
                        totalScore = 9.45 + 9.35;
                        break;
                    default:
                        break;
                }
                break;
            case "rope":
                switch (country) {
                    case "Russia":
                        totalScore = 9.6 + 9.0;
                        break;
                    case "Bulgaria":
                        totalScore = 9.5 + 9.4;
                        break;
                    case "Italy":
                        totalScore = 9.7 + 9.15;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;

        }
        double percentageToMaxScore = ((20 - totalScore) / 20) * 100;
        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, typeOfPlay);
        System.out.printf("%.2f%%%n", percentageToMaxScore);
    }
}
