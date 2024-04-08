package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utilities.Input;

public class Progression {
    public static void start(String userName) {
        System.out.println("\nWhat is the result of the expression?");
        int correctAnswersCount = 0;
        int userAnswer;

        while (correctAnswersCount != 3) {
            int length = Engine.generateRandomNumericValue(5, 10);
            int missingPlace = Engine.generateRandomNumericValue(4, length - 1);
            int startProgression = Engine.generateRandomNumericValue(1, 20);
            int step = Engine.generateRandomNumericValue(1, 20);
            int[] progression = generateProgression(length, step, startProgression);

            // Отображение последовательности
            System.out.print("Question: ");
            for (int i = 0; i < progression.length; i++) {
                if (i == missingPlace) {
                    System.out.print(".. ");
                } else {
                    System.out.print(progression[i] + " ");
                }
            }

            userAnswer = Input.inputNumeric("\nYour answer: ");

            // Проверка ответа пользователя
            int answer = progression[missingPlace];
            if (Engine.checkAnswer(userName, userAnswer, answer)) {
                correctAnswersCount++;
            }
        }
        Engine.printCongratulations(userName);
    }

    public static int[] generateProgression(int length, int step, int startProgression) {
        int[] progression = new int[length];
        progression[0] = startProgression;

        int currentNumber = startProgression;
        for (int i = 1; i < length; i++) {
            progression[i] = currentNumber + step;
            currentNumber += step;
        }

        return progression;
    }
}
