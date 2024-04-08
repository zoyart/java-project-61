package hexlet.code.utilities;

public class Validator {
    public static void searchValueInValues(String searchValue, String[] values) throws Exception {
        boolean isFound = false;
        for (String value : values) {
            if (searchValue.equalsIgnoreCase(value)) {
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            throw new Exception("");
        }
    }
}
