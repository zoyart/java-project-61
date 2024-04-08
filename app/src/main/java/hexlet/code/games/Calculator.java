package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utilities.Input;

public class Calculator {
    public static void start(String userName) {
        System.out.println("\nWhat is the result of the expression?");

        int correctAnswersCount = 0;
        int userInput;

        while (correctAnswersCount != 3) {
            int firstValue = Engine.generateRandomNumericValue(1, 100);
            int secondValue = Engine.generateRandomNumericValue(1, 100);
            String randomSign = Engine.generateRandomSign();

            int answer = switch (randomSign) {
                case "*" -> firstValue * secondValue;
                case "+" -> firstValue + secondValue;
                case "-" -> firstValue - secondValue;
                default -> 0;
            };

            System.out.println("Question: " + firstValue + " " + randomSign + " " + secondValue);
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
