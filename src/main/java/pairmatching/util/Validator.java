package pairmatching.util;

public class Validator {

    private static final String QUIT = "Q";

    private boolean isDigit(String input) {
        return input.chars().allMatch(Character::isDigit);
    }

    private boolean isQuitCommand(String input) {
        return input.equals(QUIT);
    }
}
