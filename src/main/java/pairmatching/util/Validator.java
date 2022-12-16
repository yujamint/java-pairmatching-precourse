package pairmatching.util;

import static pairmatching.util.Constant.MAX_FUNCTION_NUMBER;
import static pairmatching.util.Constant.MIN_FUNCTION_NUMBER;

import pairmatching.domain.Course;
import pairmatching.message.ErrorMessage;

public class Validator {
    private static final String QUIT = "Q";
    private static final int LENGTH_OF_FUNCTION_SELECTION = 1;

    public static void validateFunctionSelection(String input) {
        if (!isCorrectLength(input)) {
            throw new IllegalArgumentException(ErrorMessage.INCORRECT_FUNCTION_SELECTION);
        }
        if (isDigit(input) && !isValidRange(input)) {
            throw new IllegalArgumentException(ErrorMessage.INCORRECT_FUNCTION_NUMBER);
        }
        if (!isDigit(input) && !isQuitCommand(input)) {
            throw new IllegalArgumentException(ErrorMessage.INCORRECT_FUNCTION_SELECTION);
        }
    }

    private static boolean isCorrectLength(String input) {
        return input.length() == LENGTH_OF_FUNCTION_SELECTION;
    }

    private static boolean isDigit(String input) {
        return input.chars().allMatch(Character::isDigit);
    }

    private static boolean isValidRange(String input) {
        int functionOption = input.charAt(0) - '0';
        return functionOption >= MIN_FUNCTION_NUMBER && functionOption <= MAX_FUNCTION_NUMBER;
    }

    private static boolean isQuitCommand(String input) {
        return input.equals(QUIT);
    }

    private static boolean isValidCourseInput(String input) {
        return input.equals(Course.BACKEND.name()) || input.equals(Course.FRONTEND.name());
    }
}
