package JavaBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class AluminiumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfJoinery = Integer.parseInt(scanner.nextLine());
        String typeOfJoinery = scanner.nextLine();
        String delivery = scanner.nextLine();

        double price = 0.0;

        if (typeOfJoinery.equals("90X130")) {
            if (numberOfJoinery >=10 && numberOfJoinery <=30) {
                price = numberOfJoinery * 110;
            } else if(numberOfJoinery > 30 && numberOfJoinery <= 60) {
                price = (numberOfJoinery * 110) * 0.95;
            } else if (numberOfJoinery > 60 ) {
                price = (numberOfJoinery * 110) * 0.92;
            }
        } else if (typeOfJoinery.equals("100X150")) {
            if (numberOfJoinery >= 10 && numberOfJoinery <=40) {
                price = numberOfJoinery * 140;
            } else if(numberOfJoinery > 40 && numberOfJoinery <= 80) {
                price = (numberOfJoinery * 140) * 0.94;
            } else if (numberOfJoinery > 80) {
                price = (numberOfJoinery * 140) * 0.9;
            }
        } else if (typeOfJoinery.equals("130X180")) {
            if (numberOfJoinery >= 10 && numberOfJoinery <=20) {
                price = numberOfJoinery * 190;
            } else if(numberOfJoinery > 20 && numberOfJoinery <= 50) {
                price = (numberOfJoinery * 190) * 0.93;
            } else if (numberOfJoinery > 50 ) {
                price = (numberOfJoinery * 190) * 0.88;
            }
        } else if (typeOfJoinery.equals("200X300")) {
            if (numberOfJoinery >= 10 && numberOfJoinery <=25) {
                price = numberOfJoinery * 250;
            } else if(numberOfJoinery > 25 && numberOfJoinery <= 50) {
                price = (numberOfJoinery * 250) * 0.91;
            } else if (numberOfJoinery > 50 ) {
                price = (numberOfJoinery * 250) * 0.86;
            }
        }

        if (numberOfJoinery < 10) {
            System.out.println("Invalid order");
            return;
        } else if (numberOfJoinery <= 99) {
            if (delivery.equals("With delivery")) {
                price += 60;
            }
        } else {
            if (delivery.equals("With delivery")) {
                price += 60;
                price *= 0.96;
            } else if(delivery.equals("Without delivery")) {
                price *= 0.96;
            }
        }

        System.out.printf("%.2f BGN", price);

    }
}
