package hexlet.code;

public class Engine {
    public static void printWrongAnswerMessage(String userName, String userInput, String answer) {
        System.out.println("'" + userInput + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void printWrongAnswerMessage(String userName, int userInput, int answer) {
        System.out.println("'" + userInput + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static int generateRandomNumericValue(int minValue, int maxValue) {
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }

    public static String generateRandomSign() {
        String[] signs = new String[]{"*", "+", "-"};
        int randomValue = generateRandomNumericValue(0, signs.length - 1);

        return signs[randomValue];
    }

    public static void exit() {
        System.exit(0);
    }

    public static void printCongratulations(String userName) {
        System.out.println("\nCongratulations, " + userName + "!");
    }

    public static int calcGCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }

    public static boolean checkAnswer(String userName, int userAnswer, int answer) {
        if (userAnswer == answer) {
            System.out.println("Correct!");
            return true;
        } else {
            Engine.printWrongAnswerMessage(userName, userAnswer, answer);
            Engine.exit();
            return false;
        }
    }

    public static boolean checkAnswer(String userName, String userAnswer, String answer) {
        if (userAnswer.equalsIgnoreCase(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            Engine.printWrongAnswerMessage(userName, userAnswer, answer);
            Engine.exit();
            return false;
        }
    }
}
