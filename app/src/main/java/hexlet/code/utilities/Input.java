package hexlet.code.utilities;

import java.util.Scanner;

public class Input {
    public static String inputString(String textBeforeEntering) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(textBeforeEntering);
        String input = scanner.nextLine();

        return input;
    }

    public static String inputString() {
        return inputString("");
    }

    public static int inputNumeric(String textBeforeEntering) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(textBeforeEntering);
        int input = scanner.nextInt();

        return input;
    }

    public static String inputNumeric() {
        return inputString("");
    }
}
