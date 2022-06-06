package JavaBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        String bestPlayer = "";
        int mostGoals = 0;

        while(!command.equals("END")) {
            String nameOfPlayer = command;
            int numberOfGoals = Integer.parseInt(scanner.nextLine());

            if (numberOfGoals >= 10) {
                bestPlayer = nameOfPlayer;
                mostGoals = numberOfGoals;
                break;
            }

            if (numberOfGoals > mostGoals) {
                bestPlayer = nameOfPlayer;
                mostGoals = numberOfGoals;
            }

            command = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);
        if (mostGoals >= 3 ) {

        System.out.printf("He has scored %d goals and made a hat-trick !!!%n", mostGoals);

        } else {

        System.out.printf("He has scored %d goals.", mostGoals);

        }
    }
}
