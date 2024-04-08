package hexlet.code;

import hexlet.code.utilities.Input;
import hexlet.code.games.EvenGame;

public class App {
    public static void main(String[] args) {
        System.out.println("1 - Greet \n2 - Even \n0 - Exit");
        String userInput = Input.inputString("Your choice: ");

        /*
        1 - greeting
        2 - even game
        0 - exit
         */
        switch (userInput) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                String userName = Cli.greeting();
                EvenGame.start(userName);
                break;
            case "0":
                System.exit(0);
            default:
                System.exit(0);
        }
    }
}
