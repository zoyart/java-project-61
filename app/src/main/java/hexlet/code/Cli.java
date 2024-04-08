package hexlet.code;

import hexlet.code.utilities.Input;

class Cli {
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        String userName = Input.inputString("May I have your name? ");
        System.out.println("Hello, " + userName + "!");

        return userName;
    }
}
