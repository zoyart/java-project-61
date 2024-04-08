package hexlet.code;

import hexlet.code.utilities.Input;
import hexlet.code.games.Even;
import hexlet.code.games.Calculator;

public class App {
    public static void main(String[] args) {
        System.out.println("1 - Greet \n2 - Even \n3 - Calc\n0 - Exit"
        );
        String userInput = Input.inputString("Your choice: ");
        String userName;

        switch (userInput) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                userName = Cli.greeting();
                Even.start(userName);
                break;
            case "3":
                userName = Cli.greeting();
                Calculator.start(userName);
                break;
            case "0":
                Engine.exit();
            default:
                Engine.exit();
        }
    }
}
