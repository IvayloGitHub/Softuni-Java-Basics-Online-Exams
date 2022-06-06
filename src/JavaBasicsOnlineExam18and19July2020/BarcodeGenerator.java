package JavaBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int firstDigitBegin = firstNumber/1000;
        int secondDigitBegin = (firstNumber/100) % 10;
        int thirdDigitBegin = (firstNumber/10) % 10;
        int fourthDigitBegin = firstNumber % 10;

        int firstDigitEnd = secondNumber/1000;
        int secondDigitEnd = (secondNumber/100) % 10;
        int thirdDigitEnd = (secondNumber/10) % 10;
        int fourthDigitEnd = secondNumber % 10;

        for(int i = firstDigitBegin; i <= firstDigitEnd; i++) {
            if (i % 2 != 0) {
                for(int j = secondDigitBegin; j <= secondDigitEnd; j++) {
                    if (j % 2 != 0) {
                        for (int k = thirdDigitBegin; k <= thirdDigitEnd ; k++) {
                            if (k % 2 != 0) {
                                for (int l = fourthDigitBegin; l <= fourthDigitEnd ; l++) {
                                    if(l % 2 != 0) {
                                        System.out.printf("%d%d%d%d ", i, j, k, l);
                                    }
                                }
                        }

                        }
                    }
                }
            }
        }

    }
}
