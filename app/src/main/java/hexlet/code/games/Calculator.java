package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utilities.Input;

public class Calculator {
    public static void start(String userName) {
        System.out.println("\nWhat is the result of the expression?");

        int correctAnswersCount = 0;
        int userAnswer;

        while (correctAnswersCount != 3) {
            int firstValue = Engine.generateRandomNumericValue(1, 100);
            int secondValue = Engine.generateRandomNumericValue(1, 100);
            String randomSign = Engine.generateRandomSign();

            System.out.println("Question: " + firstValue + " " + randomSign + " " + secondValue);
            userAnswer = Input.inputNumeric("Your answer: ");

            // Проверка ответа пользователя
            int answer = switch (randomSign) {
                case "*" -> firstValue * secondValue;
                case "+" -> firstValue + secondValue;
                case "-" -> firstValue - secondValue;
                default -> 0;
            };
            if (Engine.checkAnswer(userName, userAnswer, answer)) {
                correctAnswersCount++;
            }
        }
        Engine.printCongratulations(userName);
    }
}
