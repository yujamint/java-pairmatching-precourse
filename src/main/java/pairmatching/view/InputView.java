package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

    public List<String> readBackendCrew() {
        ArrayList<String> backendCrews = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/backend-crew.md"));
            while (true) {
                String crew = br.readLine();
                if (crew == null) {
                    break;
                }
                backendCrews.add(crew);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return backendCrews;
    }

    public List<String> readFrontendCrew() {
        ArrayList<String> frontendCrews = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/frontend-crew.md"));
            while (true) {
                String crew = br.readLine();
                if (crew == null) {
                    break;
                }
                frontendCrews.add(crew);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return frontendCrews;
    }
}
