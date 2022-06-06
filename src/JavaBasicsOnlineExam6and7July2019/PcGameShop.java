package JavaBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class PcGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSoldGames = Integer.parseInt(scanner.nextLine());

        int limit = numberOfSoldGames;
        int firstGame = 0;
        int secondGame = 0;
        int thirdGame = 0;
        int otherGame = 0;

        while (limit > 0) {
            String nameOfGame = scanner.nextLine();
            switch (nameOfGame) {
                case "Hearthstone":
                    firstGame++;
                    break;
                case "Fornite":
                    secondGame++;
                    break;
                case "Overwatch":
                    thirdGame++;
                    break;
                default:
                    otherGame++;
                    break;
            }
            limit--;
        }

        System.out.printf("Hearthstone - %.2f%%%n", (firstGame/(numberOfSoldGames * 1.0)) * 100);
        System.out.printf("Fornite - %.2f%%%n", (secondGame/(numberOfSoldGames * 1.0)) * 100);
        System.out.printf("Overwatch - %.2f%%%n", (thirdGame/(numberOfSoldGames * 1.0)) * 100);
        System.out.printf("Others - %.2f%%%n", (otherGame/(numberOfSoldGames * 1.0)) * 100);

    }
}
