package JavaBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percentageNotPainted = Integer.parseInt(scanner.nextLine());

        double totalToBePainted
                = Math.ceil((4 * (height * width)) - ((4 * (height * width)) * percentageNotPainted/100.00));

        double paintedMeters = 0.0;

        String command = scanner.nextLine();

        while(!command.equals("Tired!")) {
            int litersOfPaint = Integer.parseInt(command);
            paintedMeters += litersOfPaint;
            if (paintedMeters >= totalToBePainted ) {
                break;
            }
            command = scanner.nextLine();
        }

        if (paintedMeters < totalToBePainted) {
            System.out.printf("%.0f quadratic m left.", totalToBePainted - paintedMeters);
        } else if (paintedMeters > totalToBePainted) {
            System.out.printf("All walls are painted and you have %.0f l paint left!",
                    paintedMeters - totalToBePainted);
        } else {
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}
