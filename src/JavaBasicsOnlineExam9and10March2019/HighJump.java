package JavaBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxHeightInSm = Integer.parseInt(scanner.nextLine());
        int startHeightInSm = maxHeightInSm - 30;
        int countOfJumps = 0;

        while (maxHeightInSm >= startHeightInSm) {
            int limitForJumps = 3;
            while (limitForJumps > 0){
                int heightOfJump = Integer.parseInt(scanner.nextLine());
                if (heightOfJump > startHeightInSm) {
                    countOfJumps++;
                    break;
                }
                countOfJumps++;
                limitForJumps--;
            }
            if (limitForJumps == 0) {
                break;
            }

            startHeightInSm += 5;

        }
        if (startHeightInSm <= maxHeightInSm) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.",
                    startHeightInSm, countOfJumps);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",
                    startHeightInSm - 5, countOfJumps);
        }
    }
}
