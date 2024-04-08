package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utilities.Input;

public class GCD {
    public static void start(String userName) {
        System.out.println("\nFind the greatest common divisor of given numbers.");

        int correctAnswersCount = 0;
        int userInput;

        while (correctAnswersCount != 3) {
            int firstValue = Engine.generateRandomNumericValue(1, 100);
            int secondValue = Engine.generateRandomNumericValue(1, 100);

            int answer = Engine.calcGCD(firstValue, secondValue);

            System.out.println("Question: " + firstValue + " " + secondValue);
            userInput = Input.inputNumeric("Your answer: ");

            // Проверка ответа пользователя
            if (userInput == answer) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                Engine.printWrongAnswerMessage(userName, userInput, answer);
                Engine.exit();
            }
        }
        Engine.printCongratulations(userName);
    }

}
