package hexlet.code.games;

import hexlet.code.utilities.Input;

public class EvenGame {
    public static void start(String userName) {
        System.out.println("\nAnswer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswersCount = 0;
        String userInput = null;

        while (correctAnswersCount != 3) {
            int randomValue = generateRandomNumericValue(1, 100);
            String answer = randomValue % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + randomValue);
            userInput = Input.inputString("Your answer: ");

            // Проверка ответа полозователя
            if (userInput.equalsIgnoreCase(answer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + userInput + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("\nCongratulations, " + userName + "!");
    }

    public static int generateRandomNumericValue(int minValue, int maxValue) {
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }
}
