package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utilities.Input;

public class Even {
    public static void start(String userName) {
        System.out.println("\nAnswer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswersCount = 0;
        String userInput = null;

        while (correctAnswersCount != 3) {
            int randomValue = Engine.generateRandomNumericValue(1, 100);
            String answer = randomValue % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + randomValue);
            userInput = Input.inputString("Your answer: ");

            // Проверка ответа пользователя
            if (userInput.equalsIgnoreCase(answer)) {
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
