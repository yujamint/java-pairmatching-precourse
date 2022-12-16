package pairmatching.message;

import static pairmatching.util.Constant.MIN_FUNCTION_NUMBER;
import static pairmatching.util.Constant.MAX_FUNCTION_NUMBER;
import static pairmatching.util.Constant.YES_MATCHING;
import static pairmatching.util.Constant.NO_MATCHING;


public class ErrorMessage {
    private static final String HEADER = "[ERROR] ";

    public static final String INCORRECT_FUNCTION_INPUT = HEADER + "잘못된 값을 입력하였습니다.";
    public static final String INCORRECT_FUNCTION_SELECTION = HEADER + "선택지에 존재하지 않는 값을 입력하였습니다.";
    public static final String INCORRECT_FUNCTION_NUMBER = String.format("%s%d~%d번 외의 선택지는 존재하지 않습니다.",
            HEADER, MIN_FUNCTION_NUMBER, MAX_FUNCTION_NUMBER);

    public static final String INCORRECT_COURSE_INPUT = HEADER + "존재하지 않는 과정명을 입력하였습니다.";
    public static final String INCORRECT_LEVEL_INPUT = HEADER + "해당 과정에 존재하지 않는 레벨을 입력하였습니다.";
    public static final String INCORRECT_MISSION_INPUT = HEADER + "해당 레벨에 존재하지 않는 미션을 입력하였습니다.";

    public static final String INCORRECT_MATCHING_COMMAND = String.format("%s\"%s\" 또는 \"%s\" 만 입력 가능합니다.)",
            HEADER, YES_MATCHING, NO_MATCHING);
}
