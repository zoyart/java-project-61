package hexlet.code;

import hexlet.code.utilities.Input;
import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;


public class App {
    public static void main(String[] args) {
        System.out.println("1 - Greet \n2 - Even \n3 - Calc\n4 - GCD\n0 - Exit");
        int userInput = Input.inputNumeric("Your choice: ");

        String userName = "";
        if (userInput != 0) {
            userName = Cli.greeting();
        }

        switch (userInput) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                Even.start(userName);
                break;
            case 3:
                Calculator.start(userName);
                break;
            case 4:
                GCD.start(userName);
                break;
            case 0:
                Engine.exit();
            default:
                Engine.exit();
        }
    }
}
