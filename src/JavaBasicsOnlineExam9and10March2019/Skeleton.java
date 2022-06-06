package JavaBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bestTimeMinutes = Integer.parseInt(scanner.nextLine());
        int bestTimeSeconds = Integer.parseInt(scanner.nextLine());
        double lengthInMeters = Double.parseDouble(scanner.nextLine());
        int secondsFor100Meters = Integer.parseInt(scanner.nextLine());

        int bestTimeInSeconds = bestTimeMinutes * 60 + bestTimeSeconds;

        double timeDecrease = (lengthInMeters / 120) * 2.5;

        double totalTime = (lengthInMeters / 100) * secondsFor100Meters - timeDecrease;

        if (totalTime <= bestTimeInSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", totalTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", totalTime - bestTimeInSeconds);
        }
    }
}
