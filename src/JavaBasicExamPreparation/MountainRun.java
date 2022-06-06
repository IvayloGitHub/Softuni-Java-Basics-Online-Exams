package JavaBasicExamPreparation;

import java.util.Scanner;

public class MountainRun {
    public MountainRun() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());

        double distance = Double.parseDouble(scanner.nextLine());

        double timeForOneMeter = Double.parseDouble(scanner.nextLine());
        double delay = Math.floor(distance / 50.0) * 30.0;
        double totalTime = distance * timeForOneMeter + delay;

        if (totalTime < recordInSec) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", totalTime - recordInSec);
        }
    }
}
