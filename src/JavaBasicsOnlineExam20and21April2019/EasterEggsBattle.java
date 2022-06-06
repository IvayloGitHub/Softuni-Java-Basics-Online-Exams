package JavaBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsOfFirstPlayer = Integer.parseInt(scanner.nextLine());
        int eggsOfSecondPlayer = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while(!command.equals("End")) {


            if (command.equals("one")) {
                eggsOfSecondPlayer--;
                if(eggsOfSecondPlayer == 0) {
                    break;
                }
            } else if (command.equals("two")) {
                eggsOfFirstPlayer--;
                if (eggsOfFirstPlayer == 0) {
                    break;
                }
            }
            command = scanner.nextLine();
        }
        if(eggsOfFirstPlayer == 0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsOfSecondPlayer);
        }
        if (eggsOfSecondPlayer == 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsOfFirstPlayer);
        }
        if (command.equals("End")) {
            System.out.printf("Player one has %d eggs left.%n", eggsOfFirstPlayer);
            System.out.printf("Player two has %d eggs left.%n", eggsOfSecondPlayer);
        }
    }
}
