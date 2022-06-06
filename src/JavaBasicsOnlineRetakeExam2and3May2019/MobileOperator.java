package JavaBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String durationOfContract = scanner.nextLine();
        String typeOfContract = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int numberOfMonths = Integer.parseInt(scanner.nextLine());
        double priceForContract = 0.0;

        if (durationOfContract.equals("one")) {
            if (mobileInternet.equals("yes")) {
                if (typeOfContract.equals("Small")) {
                    priceForContract = numberOfMonths * (9.98 + 5.50);
                } else if (typeOfContract.equals("Middle")) {
                    priceForContract = numberOfMonths * (18.99 + 4.35);
                } else if (typeOfContract.equals("Large")) {
                    priceForContract = numberOfMonths * (25.98 + 4.35);
                } else if (typeOfContract.equals("ExtraLarge")) {
                    priceForContract = numberOfMonths * (35.99 + 3.85);
                }
            } else if (mobileInternet.equals("no")) {
                if (typeOfContract.equals("Small")) {
                    priceForContract = numberOfMonths * 9.98;
                } else if (typeOfContract.equals("Middle")) {
                    priceForContract = numberOfMonths * 18.99;
                } else if (typeOfContract.equals("Large")) {
                    priceForContract = numberOfMonths * 25.98;
                } else if (typeOfContract.equals("ExtraLarge")) {
                    priceForContract = numberOfMonths * 35.99;
                }
            }
        } else if (durationOfContract.equals("two")) {
            if (mobileInternet.equals("yes")) {
                if (typeOfContract.equals("Small")) {
                    priceForContract = numberOfMonths * (8.58 + 5.50);
                    priceForContract = priceForContract * 0.9625;
                } else if (typeOfContract.equals("Middle")) {
                    priceForContract = numberOfMonths * (17.09 + 4.35);
                    priceForContract = priceForContract * 0.9625;
                } else if (typeOfContract.equals("Large")) {
                    priceForContract = numberOfMonths * (23.59 + 4.35);
                    priceForContract = priceForContract * 0.9625;
                } else if (typeOfContract.equals("ExtraLarge")) {
                    priceForContract = numberOfMonths * (31.79 + 3.85);
                    priceForContract = priceForContract * 0.9625;
                }
            } else if (mobileInternet.equals("no")) {
                if (typeOfContract.equals("Small")) {
                    priceForContract = numberOfMonths * 8.58;
                    priceForContract = priceForContract * 0.9625;
                } else if (typeOfContract.equals("Middle")) {
                    priceForContract = numberOfMonths * 17.09;
                    priceForContract = priceForContract * 0.9625;
                } else if (typeOfContract.equals("Large")) {
                    priceForContract = numberOfMonths * 23.59;
                    priceForContract = priceForContract * 0.9625;
                } else if (typeOfContract.equals("ExtraLarge")) {
                    priceForContract = numberOfMonths * 31.79;
                    priceForContract = priceForContract * 0.9625;
                }
            }
        }
        System.out.printf("%.2f lv.", priceForContract);
    }
}
