package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utilities.Input;

import java.math.BigInteger;

public class Prime {
    public static void start(String userName) {
        System.out.println("\nAnswer 'yes' if given number is prime. Otherwise answer 'no'.");
        int correctAnswersCount = 0;
        final int requiredNumberAnswers = 3;
        String userAnswer;

        while (correctAnswersCount != requiredNumberAnswers) {
            final int maxPrimeNumber = 101;
            int randomNumber = Engine.generateRandomNumericValue(2, maxPrimeNumber);
            BigInteger bigInteger = BigInteger.valueOf(randomNumber);

            System.out.println("Question: " + randomNumber);
            userAnswer = Input.inputString("\nYour answer: ");

            // Проверка ответа пользователя
            String answer = bigInteger.isProbablePrime((int) Math.log(randomNumber)) ? "yes" : "no";
            if (Engine.checkAnswer(userName, userAnswer, answer)) {
                correctAnswersCount++;
            }
        }
        Engine.printCongratulations(userName);
    }
}
