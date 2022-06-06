package JavaBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class FavouriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfMovies = 0;
        String command = scanner.nextLine();
        String bestMovie = "";
        int bestPoints = 0;


        while(!command.equals("STOP")) {
            String nameOfMovie = command;
            int smallLetterCount = 0;
            int capitalLettersCount = 0;
            int currentPoints = 0;

            for (int i = 0; i < nameOfMovie.length(); i++) {
                currentPoints += nameOfMovie.charAt(i);
                if (Character.isUpperCase(nameOfMovie.charAt(i))) {
                    capitalLettersCount++;
                } else if (Character.isLowerCase(nameOfMovie.charAt(i))){
                    smallLetterCount++;
                }
            }
            currentPoints = currentPoints - (capitalLettersCount * nameOfMovie.length())
                    - (smallLetterCount * (2 * nameOfMovie.length()));

            if (currentPoints > bestPoints) {
                bestPoints = currentPoints;
                bestMovie = nameOfMovie;
            }
            countOfMovies++;
            if (countOfMovies == 7) {
                break;
            }

            command = scanner.nextLine();
        }

        if (!command.equals("STOP")) {
            System.out.println("The limit is reached.");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, bestPoints);
    }
}
