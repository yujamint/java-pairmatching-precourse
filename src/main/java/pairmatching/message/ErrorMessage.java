package pairmatching.message;

import static pairmatching.util.Constant.MIN_FUNCTION_NUMBER;
import static pairmatching.util.Constant.MAX_FUNCTION_NUMBER;

public class ErrorMessage {
    private static final String HEADER = "[ERROR] ";
    public static final String INCORRECT_FUNCTION_SELECTION = HEADER + "존재하지 않는 선택지를 입력하였습니다.";
    public static final String INCORRECT_FUNCTION_NUMBER = String.format("%s %d~%d번 외의 선택지는 존재하지 않습니다.",
            HEADER, MIN_FUNCTION_NUMBER, MAX_FUNCTION_NUMBER);

}
