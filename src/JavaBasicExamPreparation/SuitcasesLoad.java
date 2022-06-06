package JavaBasicExamPreparation;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());

        int numberOfLoadedSuitCases = 0;

        String command = scanner.nextLine();

        while(!command.equals("End")) {
            double capacityOfSuitCase = Double.parseDouble(command);

            if ((numberOfLoadedSuitCases + 1) % 3 == 0) {
                capacityOfSuitCase = capacityOfSuitCase * 1.1;
            }
            if (capacity >= capacityOfSuitCase) {

                capacity -= capacityOfSuitCase;
            } else {
                System.out.println("No more space!");
                break;
            }

            numberOfLoadedSuitCases++;
            command = scanner.nextLine();
        }
        if (command.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", numberOfLoadedSuitCases);
    }
}
