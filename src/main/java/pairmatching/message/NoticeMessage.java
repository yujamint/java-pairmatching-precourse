package pairmatching.message;

import pairmatching.domain.Level;
import pairmatching.util.Constant;

public class NoticeMessage {
    public static final String FUNCTION_SELECTION_NOTICE = "기능을 선택하세요.\n"
            + "1. 페어 매칭\n"
            + "2. 페어 조회\n"
            + "3. 페어 초기화\n"
            + "Q. 종료";
    public static final String DETAIL_INFORMATION_INPUT_NOTICE = String.format(
            "#############################################\n"
                    + "과정: 백엔드 | 프론트엔드\n"
                    + "미션: \n"
                    + "\t- %s: 자동차경주 | 로또 | 숫자야구게임\n"
                    + "\t- %s: 장바구니 | 결제 | 지하철노선도\n"
                    + "\t- %s:\n"
                    + "\t- %s: 성능개선 | 배포\n"
                    + "\t- %s:\n"
                    + "#############################################\n"
                    + "과정, 레벨, 미션을 선택하세요.\n"
                    + "ex) 백엔드, 레벨1, 자동차경주",
            Level.LEVEL1.getName(), Level.LEVEL2.getName(), Level.LEVEL3.getName(), Level.LEVEL4.getName(),
            Level.LEVEL5.getName()
    );
    public static final String REMATCHING_COMMAND_INPUT_NOTICE = String.format(
            "매칭 정보가 있습니다. 다시 매칭하시겠습니까?\n"
                    + "%s | %s",
            Constant.YES_MATCHING, Constant.NO_MATCHING
    );
    public static final String PAIR_INITIALIZE_NOTICE = "초기화 되었습니다.";
}
