package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utilities.Input;

public class GCD {
    public static void start(String userName) {
        System.out.println("\nFind the greatest common divisor of given numbers.");

        int correctAnswersCount = 0;
        int userAnswer;
        final int requiredNumberAnswers = 3;

        while (correctAnswersCount != requiredNumberAnswers) {
            final int maxFirstValue = 100;
            int firstValue = Engine.generateRandomNumericValue(1, maxFirstValue);

            final int maxSecondValue = 100;
            int secondValue = Engine.generateRandomNumericValue(1, maxSecondValue);

            System.out.println("Question: " + firstValue + " " + secondValue);
            userAnswer = Input.inputNumeric("Your answer: ");

            // Проверка ответа пользователя
            int answer = Engine.calcGCD(firstValue, secondValue);
            if (Engine.checkAnswer(userName, userAnswer, answer)) {
                correctAnswersCount++;
            }
        }
        Engine.printCongratulations(userName);
    }

}
