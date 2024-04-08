package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.utilities.Input;
import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        System.out.println("1 - Greet \n2 - Even \n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
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
            case 5:
                Progression.start(userName);
                break;
            case 6:
                Prime.start(userName);
                break;
            case 0:
                Engine.exit();
            default:
                Engine.exit();
        }
    }
}
