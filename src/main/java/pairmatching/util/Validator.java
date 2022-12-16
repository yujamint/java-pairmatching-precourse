package pairmatching.util;

public class Validator {
    private static final String QUIT = "Q";
    private static final int LENGTH_OF_FUNCTION_SELECTION = 1;

    private boolean isCorrectLength(String input) {
        return input.length() == LENGTH_OF_FUNCTION_SELECTION;
    }

    private boolean isDigit(String input) {
        return input.chars().allMatch(Character::isDigit);
    }

    private boolean isQuitCommand(String input) {
        return input.equals(QUIT);
    }
}
