package pairmatching.controller;

import pairmatching.domain.Crews;
import pairmatching.util.Constant;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairController {
    private InputView inputView;
    private OutputView outputView;
    private Crews backendCrews;
    private Crews frontendCrews;


    public void runGame() {
        outputView.printMainMenu();
        String functionSelection = inputView.readFunctionSelection();

    }

    private void selectMenu() {
        outputView.printMainMenu();
        String functionSelection = inputView.readFunctionSelection();

        if (functionSelection.equals(Constant.PAIR_MATCHING)) {
            pairMatching();
        }
        if (functionSelection.equals(Constant.PAIR_LOOKUP)) {
            pairLookup();
        }
        if (functionSelection.equals(Constant.PAIR_INITIALIZE)) {
            pairInitialize();
        }
    }

    private void pairMatching() {
        outputView.printDetailInformationInputNotice();
        inputView.readDetailInformation();
    }

    private void pairLookup() {
        outputView.printDetailInformationInputNotice();
        inputView.readDetailInformation();
    }

    private void pairInitialize() {
        outputView.printPairInitializeNotice();
    }

}
