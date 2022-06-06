package JavaBasicExamPreparation;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine());
        double first = 0.0;
        double second = 0.0;
        double third = 0.0;
        double fourth = 0.0;
        double fifth = 0.0;

        int totalNumberOfPeople =0;


        while(numberOfGroups > 0) {
            int numberOfPeopleInTheGroup = Integer.parseInt(scanner.nextLine());
            totalNumberOfPeople += numberOfPeopleInTheGroup;

            if (numberOfPeopleInTheGroup <= 5) {
                first += numberOfPeopleInTheGroup;
            } else if (numberOfPeopleInTheGroup <= 12) {
                second += numberOfPeopleInTheGroup;
            } else if (numberOfPeopleInTheGroup <= 25) {
                third += numberOfPeopleInTheGroup;
            } else if (numberOfPeopleInTheGroup <=40) {
                fourth += numberOfPeopleInTheGroup;
            } else {
                fifth += numberOfPeopleInTheGroup;
            }
            numberOfGroups--;
        }

        System.out.printf("%.2f%%%n", (first/totalNumberOfPeople) * 100);
        System.out.printf("%.2f%%%n", (second/totalNumberOfPeople) * 100);
        System.out.printf("%.2f%%%n", (third/totalNumberOfPeople) * 100);
        System.out.printf("%.2f%%%n", (fourth/totalNumberOfPeople) * 100);
        System.out.printf("%.2f%%%n", (fifth/totalNumberOfPeople) * 100);
    }
}
