package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.util.Validator;

public class InputView {

    public String readFunctionSelection() {
        String input = Console.readLine();
        Validator.validateFunctionSelection(input);
        return input;
    }

    public String readDetailInformation() {
        String input = Console.readLine();
        Validator.validateDetailInformation(input);
        return input;
    }

    public String readReMatchingCommand() {
        String input = Console.readLine();
        Validator.validateReMatchingCommand(input);
        return input;
    }
}
