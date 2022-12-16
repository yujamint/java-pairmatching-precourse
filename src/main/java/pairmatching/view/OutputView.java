package pairmatching.view;

import pairmatching.message.NoticeMessage;

public class OutputView {

    public void printMainMenu() {
        System.out.println(NoticeMessage.FUNCTION_SELECTION_NOTICE + '\n');
    }

    public void printDetailInformationInputNotice() {
        System.out.println(NoticeMessage.DETAIL_INFORMATION_INPUT_NOTICE + '\n');
    }

    public void printRematchingCommandInputNotice() {
        System.out.println(NoticeMessage.REMATCHING_COMMAND_INPUT_NOTICE);
    }

    public void printPairInitializeNotice() {
        System.out.println(NoticeMessage.PAIR_INITIALIZE_NOTICE);
    }

}
