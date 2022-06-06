package JavaBasicsOnlineExam6and7April2019;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMovies = Integer.parseInt(scanner.nextLine());
        int limit = numberOfMovies;

        double bestRating = 0.0;
        double worseRating = Double.MAX_VALUE;
        String bestMovie = "";
        String worseMovie = "";
        double averageRating = 0.0;

        while(limit > 0) {
            String nameOfMovie = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            averageRating += rating;

            if (rating > bestRating) {
                bestRating = rating;
                bestMovie = nameOfMovie;
            }

            if (rating < worseRating) {
                worseRating = rating;
                worseMovie = nameOfMovie;
            }

            limit--;
        }

        System.out.printf("%s is with highest rating: %.1f%n", bestMovie, bestRating);
        System.out.printf("%s is with lowest rating: %.1f%n", worseMovie, worseRating);
        System.out.printf("Average rating: %.1f", averageRating / numberOfMovies);
    }
}
