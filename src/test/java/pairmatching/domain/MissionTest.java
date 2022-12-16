package pairmatching.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MissionTest {

    @Test
    @DisplayName("입력한 레벨에 해당하는 미션 List를 반환한다.")
    void 레벨_1_미션_List_반환() {
        String inputLevel = "레벨1";

        List<Mission> missions = Mission.missionsByLevel(inputLevel);

        assertThat(missions).containsOnly(Mission.CAR_RACING, Mission.LOTTO, Mission.NUMBER_BASEBALL);
    }
}