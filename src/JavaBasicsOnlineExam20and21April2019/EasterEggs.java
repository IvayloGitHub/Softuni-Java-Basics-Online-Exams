package JavaBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPaintedEggs = Integer.parseInt(scanner.nextLine());
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;

        int mostEggs = 0;
        String color = "";

        while(numberOfPaintedEggs > 0) {
            String colorOfEgg = scanner.nextLine();

            switch (colorOfEgg) {
                case "red":
                    red++;
                    break;
                case "orange":
                    orange++;
                    break;
                case "blue":
                    blue++;
                    break;
                case "green":
                    green++;
                    break;
            }

            numberOfPaintedEggs--;
        }
        if (red > orange && red > blue && red > green) {
            mostEggs = red;
            color = "red";
        } else if (orange > red && orange > blue && orange > green) {
            mostEggs = orange;
            color = "orange";
        } else if (blue > red && blue > orange && blue > green) {
            mostEggs = blue;
            color = "blue";
        } else {
            mostEggs = green;
            color = "green";
        }

        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);
        System.out.printf("Max eggs: %d -> %s", mostEggs, color);

    }
}
