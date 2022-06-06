package JavaBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class TheMostPowerful {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bestScore = 0.0;
        String winningWord = "";

        String command = scanner.nextLine();

        while(!command.equals("End of words")) {
            String word = command;
            int limit = word.length();
            double pointsOfWord = 0.0;

            for (int i = 0; i < limit; i++) {
                char letter = word.charAt(i);
                pointsOfWord += letter;
            }

            if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o'
            || word.charAt(0) == 'u' || word.charAt(0) == 'y' || word.charAt(0) == 'A' || word.charAt(0) == 'E'
            || word.charAt(0) == 'I' || word.charAt(0) == 'O' || word.charAt(0) == 'U' || word.charAt(0) == 'Y') {
                pointsOfWord = pointsOfWord * word.length();
            } else {
                pointsOfWord = Math.floor(pointsOfWord / (word.length() * 1.0));
            }

            if (pointsOfWord > bestScore) {
                winningWord = word;
                bestScore = pointsOfWord;
            }
            command = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", winningWord, bestScore);
    }
}
