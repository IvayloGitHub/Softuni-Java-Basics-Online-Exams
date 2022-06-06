package JavaBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sizeOfEggs = scanner.nextLine();
        String colorOfEggs = scanner.nextLine();
        int numberOfEggshells = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;

        switch (sizeOfEggs){
            case "Large":
                switch (colorOfEggs) {
                    case "Red":
                        totalPrice = numberOfEggshells * 16;
                        break;
                    case "Green":
                        totalPrice = numberOfEggshells * 12;
                        break;
                    case "Yellow":
                        totalPrice = numberOfEggshells * 9;
                        break;
                    default:
                        break;
                }
                break;
            case "Medium":
                switch (colorOfEggs) {
                    case "Red":
                        totalPrice = numberOfEggshells * 13;
                        break;
                    case "Green":
                        totalPrice = numberOfEggshells * 9;
                        break;
                    case "Yellow":
                        totalPrice = numberOfEggshells * 7;
                        break;
                    default:
                        break;
                }
                break;
            case "Small":
                switch (colorOfEggs) {
                    case "Red":
                        totalPrice = numberOfEggshells * 9;
                        break;
                    case "Green":
                        totalPrice = numberOfEggshells * 8;
                        break;
                    case "Yellow":
                        totalPrice = numberOfEggshells * 5;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        System.out.printf("%.2f leva.", totalPrice * 0.65);
    }
}
