package hexlet.code.utilities;

import java.util.Scanner;

public class Input {
    public static String inputString(String textBeforeEntering) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(textBeforeEntering);

        return scanner.nextLine();
    }

    public static String inputString() {
        return inputString("");
    }

    public static int inputNumeric(String textBeforeEntering) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(textBeforeEntering);

        return scanner.nextInt();
    }

    public static int inputNumeric() {
        return inputNumeric("");
    }
}
