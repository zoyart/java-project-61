package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utilities.Input;

public class Progression {
    public static void start(String userName) {
        System.out.println("\nWhat number is missing in the progression?");
        int correctAnswersCount = 0;
        int userAnswer;
        final int requiredNumberAnswers = 3;

        while (correctAnswersCount != requiredNumberAnswers) {
            final int minLenProgression = 5;
            final int maxLenProgression = 10;
            int length = Engine.generateRandomNumericValue(minLenProgression, maxLenProgression);

            final int minMissPlace = 4;
            int missingPlace = Engine.generateRandomNumericValue(minMissPlace, length - 1);

            final int minStartProgression = 1;
            final int maxStartProgression = 20;
            int startProgression = Engine.generateRandomNumericValue(minStartProgression, maxStartProgression);

            int minStep = 1;
            int maxStep = 20;
            int step = Engine.generateRandomNumericValue(minStep, maxStep);
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
