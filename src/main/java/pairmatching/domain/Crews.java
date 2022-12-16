package pairmatching.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class Crews {

    private List<Crew> crews;

    public Crews(List<Crew> crews) {
        this.crews = crews;
    }

    private void shuffle() {
        crews = Randoms.shuffle(crews);
    }


}
