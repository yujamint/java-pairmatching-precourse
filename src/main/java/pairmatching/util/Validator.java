package pairmatching.util;

public class Validator {
    private static final String QUIT = "Q";
    private static final int LENGTH_OF_FUNCTION_OPTION = 1;
    private static final int MIN_OPTION = 1;
    private static final int MAX_OPTION = 3;

    private boolean isCorrectLength(String input) {
        return input.length() == LENGTH_OF_FUNCTION_OPTION;
    }

    private boolean isDigit(String input) {
        return input.chars().allMatch(Character::isDigit);
    }

    private boolean isValidRange(String input) {
        int functionOption = input.charAt(0) - '0';
        return functionOption >= MIN_OPTION && functionOption <= MAX_OPTION;
    }

    private boolean isQuitCommand(String input) {
        return input.equals(QUIT);
    }
}
