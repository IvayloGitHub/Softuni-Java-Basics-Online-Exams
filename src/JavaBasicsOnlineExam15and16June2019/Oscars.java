package JavaBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfActor = scanner.nextLine();
        double totalPoints = Double.parseDouble(scanner.nextLine());
        int numberOfJury = Integer.parseInt(scanner.nextLine());

        while (numberOfJury > 0) {
            String nameOfJury = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            if (totalPoints >= 1250.5) {
                break;
            }
            totalPoints = totalPoints + (nameOfJury.length() * points) / 2.0;
            numberOfJury--;
        }
        if(totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",
                    nameOfActor, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", nameOfActor, 1250.50 - totalPoints);
        }
    }
}
