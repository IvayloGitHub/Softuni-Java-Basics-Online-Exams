package JavaBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBalls = Integer.parseInt(scanner.nextLine());
        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int different = 0;
        double points = 0;

        while (numberOfBalls > 0) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                   points += 5;
                   red++;
                   break;
                case "orange":
                    points += 10;
                    orange++;
                    break;
                case "yellow":
                    points += 15;
                    yellow++;
                    break;
                case "white":
                    points += 20;
                    white++;
                    break;
                case "black":
                    points = Math.floor(points / 2);
                    black++;
                    break;
                default:
                    different++;
                    break;
            }
            numberOfBalls--;
        }
        System.out.printf("Total points: %.0f%n", points);
        System.out.printf("Red balls: %d%n", red);
        System.out.printf("Orange balls: %d%n", orange);
        System.out.printf("Yellow balls: %d%n", yellow);
        System.out.printf("White balls: %d%n", white);
        System.out.printf("Other colors picked: %d%n", different);
        System.out.printf("Divides from black balls: %d%n", black);
    }
}
