package JavaBasicsOnlineExam6and7April2019;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine());

        double statuette = hallRent * 0.7;
        double catering = statuette * 0.85;
        double soundSystem = catering / 2.0;

        double priceForCeremony = hallRent + statuette + catering + soundSystem;

        System.out.printf("%.2f", priceForCeremony);
    }
}
