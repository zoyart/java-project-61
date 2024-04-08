package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utilities.Input;

public class Even {
    public static void start(String userName) {
        System.out.println("\nAnswer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswersCount = 0;
        String userAnswer;

        while (correctAnswersCount != 3) {
            int randomValue = Engine.generateRandomNumericValue(1, 100);

            System.out.println("Question: " + randomValue);
            userAnswer = Input.inputString("Your answer: ");

            // Проверка ответа пользователя
            String answer = randomValue % 2 == 0 ? "yes" : "no";
            if (Engine.checkAnswer(userName, userAnswer, answer)) {
                correctAnswersCount++;
            }
        }
        Engine.printCongratulations(userName);
    }
}
