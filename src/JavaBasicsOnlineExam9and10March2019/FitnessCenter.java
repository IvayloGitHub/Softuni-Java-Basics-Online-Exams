package JavaBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfVisitors = Integer.parseInt(scanner.nextLine());
        int limit = numberOfVisitors;
        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int shake = 0;
        int bar = 0;
        int peopleTraining = 0;
        int peopleForProteins = 0;

        while (numberOfVisitors > 0) {
            String activity = scanner.nextLine();

            switch (activity) {
                case "Back":
                    back++;
                    peopleTraining++;
                    break;
                case "Chest":
                    chest++;
                    peopleTraining++;
                    break;
                case "Legs":
                    legs++;
                    peopleTraining++;
                    break;
                case "Abs":
                    abs++;
                    peopleTraining++;
                    break;
                case "Protein shake":
                    shake++;
                    peopleForProteins++;
                    break;
                case "Protein bar":
                    bar++;
                    peopleForProteins++;
                    break;
                default:
                    break;
            }
            numberOfVisitors--;
        }
        double percentageOfPeopleTraining = ((peopleTraining * 1.0) / limit) * 100;
        double percentageOfPeopleForProteins = ((peopleForProteins * 1.0) / limit) * 100;

        System.out.printf("%d - back%n", back);
        System.out.printf("%d - chest%n", chest);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", shake);
        System.out.printf("%d - protein bar%n", bar);
        System.out.printf("%.2f%% - work out%n", percentageOfPeopleTraining);
        System.out.printf("%.2f%% - protein", percentageOfPeopleForProteins);

    }
}
