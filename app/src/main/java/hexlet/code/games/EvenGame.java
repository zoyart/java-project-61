package hexlet.code.games;

import hexlet.code.utilities.Input;

public class EvenGame {
    public static void start(String userName) {
        System.out.println("\nAnswer 'yes' if the number is even, otherwise answer 'no'.");

        int questionsCount = 3;
        int[] randomValues = new int[3];

        // Filling an array with random numbers
        for (int i = 0; i < questionsCount; i++) {
            int minValue = 1;
            int maxValue = 100;
            int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));

            randomValues[i] = randomValue;
        }

        int correctAnswersCount = 0;

        for (int i = 0; i < questionsCount;) {
            String answer = randomValues[i] % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + randomValues[i]);

            String userInput = Input.inputString("Your answer: ");
            if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("no")) {
                if (userInput.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    correctAnswersCount++;
                    i++;
                }
            } else {
                System.out.println("Введён некорректный ответ, попробуйте ещё раз");
                continue;
            }

            if (correctAnswersCount == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
