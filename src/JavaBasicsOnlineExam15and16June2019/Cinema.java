package JavaBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;

        String command = scanner.nextLine();

        while(!command.equals("Movie time!")) {
            int numberOfPeopleEntering = Integer.parseInt(command);
            if (numberOfPeopleEntering > capacity) {
                break;
            } else {
                capacity -= numberOfPeopleEntering;
                if (numberOfPeopleEntering % 3 == 0) {
                    totalPrice = totalPrice + (numberOfPeopleEntering * 5) - 5;
                } else {
                    totalPrice = totalPrice + numberOfPeopleEntering * 5;
                }
            }

            command = scanner.nextLine();
        }
        if (command.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.%n", capacity);
        } else {
            System.out.println("The cinema is full.");
        }
        System.out.printf("Cinema income - %.0f lv.", totalPrice);
    }
}
