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
        String userName = userInput != 0 ? Cli.greeting() : "";
        String[] choices = {"Greet", "Even", "Calc", "GCD", "Progression", "Prime", "Exit"};

        switch (choices[userInput - 1]) {
            case "Greet":
                break;
            case "Even":
                Even.start(userName);
                break;
            case "Calc":
                Calculator.start(userName);
                break;
            case "GCD":
                GCD.start(userName);
                break;
            case "Progression":
                Progression.start(userName);
                break;
            case "Prime":
                Prime.start(userName);
                break;
            case "Exit":
                Engine.exit();
            default:
                Engine.exit();
        }
    }
}
