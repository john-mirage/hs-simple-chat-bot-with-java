package bot;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputString() {
        while (true) {
            String input = scanner.nextLine();
            if (Validator.stringIsNotEmpty(input)) {
                return input;
            } else {
                System.out.println("Error: the input is empty");
            }
        }
    }

    private static int inputInteger() {
        while (true) {
            String input = inputString();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: the input is not a number");
            }
        }
    }

    public static int inputPositiveNumberOrZero() {
        while (true) {
            int number = inputInteger();
            if (Validator.integerIsPositiveOrZero(number)) {
                return number;
            } else {
                System.out.println("Error: the input is not a positive number or zero");
            }
        }
    }

    public static int inputPositiveNumber() {
        while (true) {
            int number = inputInteger();
            if (Validator.integerIsPositive(number)) {
                return number;
            } else {
                System.out.println("Error: the input is not a positive number");
            }
        }
    }

    public static void close() {
        scanner.close();
    }
}
