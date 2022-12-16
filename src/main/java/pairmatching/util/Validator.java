package pairmatching.util;

import static pairmatching.util.Constant.MAX_FUNCTION_NUMBER;
import static pairmatching.util.Constant.MIN_FUNCTION_NUMBER;

import pairmatching.domain.Course;
import pairmatching.domain.Level;
import pairmatching.domain.Mission;
import pairmatching.message.ErrorMessage;

public class Validator {
    private static final String QUIT = "Q";
    private static final int LENGTH_OF_FUNCTION_SELECTION = 1;
    private static final int COURSE_INDEX = 0;
    private static final int LEVEL_INDEX = 1;
    private static final int MISSION_INDEX = 2;

    public static void validateFunctionSelection(String input) {
        if (!isCorrectLength(input)) {
            throw new IllegalArgumentException(ErrorMessage.INCORRECT_FUNCTION_INPUT);
        }
        if (isDigit(input) && !isValidRange(input)) {
            throw new IllegalArgumentException(ErrorMessage.INCORRECT_FUNCTION_NUMBER);
        }
        if (!isDigit(input) && !isQuitCommand(input)) {
            throw new IllegalArgumentException(ErrorMessage.INCORRECT_FUNCTION_SELECTION);
        }
    }

    public static void validateDetailInformation(String input) {
        String[] splitInput = input.split(", ");
        String inputCourse = splitInput[COURSE_INDEX];
        String inputLevel = splitInput[LEVEL_INDEX];
        String inputMission = splitInput[MISSION_INDEX];

        if (!isValidCourseInput(inputCourse)) {
            throw new IllegalArgumentException(ErrorMessage.INCORRECT_COURSE_INPUT);
        }
        if (!isValidLevelInput(inputLevel)) {
            throw new IllegalArgumentException(ErrorMessage.INCORRECT_LEVEL_INPUT);
        }
        if (!isValidMissionInput(inputLevel, inputMission)) {
            throw new IllegalArgumentException(ErrorMessage.INCORRECT_MISSION_INPUT);
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

    private static boolean isValidCourseInput(String inputCourse) {
        return Course.names().contains(inputCourse);
    }

    private static boolean isValidLevelInput(String inputLevel) {
        return Level.names().contains(inputLevel);
    }

    private static boolean isValidMissionInput(String inputLevel, String inputMission) {
        return Mission.missionsByLevel(inputLevel).stream()
                .anyMatch(mission -> mission.name().equals(inputMission));
    }
}
