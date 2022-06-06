package JavaBasicExamPreparation;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int daysWon = 0;
        int daysLost = 0;
        double totalMoneyWon = 0.0;

        int daysForTournament = Integer.parseInt(scanner.nextLine());

       while(daysForTournament > 0) {
           String command = scanner.nextLine();
           int gamesWon = 0;
           int gamesLost = 0;
           double moneyWonForTheDay = 0.0;
           while(!command.equals("Finish")) {
               String nameOfSport = command;
               String winOrLose = scanner.nextLine();

               if (winOrLose.equals("win")) {
                   moneyWonForTheDay += 20;
                   gamesWon++;
               } else {
                   gamesLost++;
               }
               command = scanner.nextLine();

           }

           if (gamesWon > gamesLost) {
               moneyWonForTheDay *= 1.1;
               daysWon++;
           } else {
               daysLost++;
           }

           totalMoneyWon += moneyWonForTheDay;
           daysForTournament--;
       }
       if (daysWon > daysLost) {
           totalMoneyWon *= 1.2;
           System.out.printf("You won the tournament! Total raised money: %.2f", totalMoneyWon);
       } else {
           System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoneyWon);
       }
    }
}
