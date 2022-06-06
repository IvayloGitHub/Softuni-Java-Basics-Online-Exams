package JavaBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForAction = Integer.parseInt(scanner.nextLine());
        int numberOfScenes = Integer.parseInt(scanner.nextLine());
        int timeForScene = Integer.parseInt(scanner.nextLine());

        double timeForPreparation = timeForAction * 0.15;
        double totalTime = timeForPreparation + numberOfScenes * timeForScene;


        if (totalTime <= timeForAction) {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!",
                    Math.round(timeForAction - totalTime));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.",
                    Math.round(totalTime - timeForAction));
        }
    }
}
