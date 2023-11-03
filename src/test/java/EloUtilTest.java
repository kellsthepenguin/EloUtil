import me.jwkim.eloutil.EloGameResult;
import me.jwkim.eloutil.EloUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class EloUtilTest {
    @DisplayName("elo win rate test")
    @Test()
    void eloWinRateTest() {
        Assertions.assertEquals(0.5, EloUtil.getEstimatedWinRate(500, 500));
        Assertions.assertEquals(0.64, EloUtil.getEstimatedWinRate(600, 500));
    }

    @DisplayName("elo rating change")
    @Test()
    void eloRatingChangeTest() {
        Assertions.assertEquals(10, EloUtil.getRatingChange(500, 500, 20, EloGameResult.WIN));
        Assertions.assertEquals(-15, EloUtil.getRatingChange(690.85, 500, 20, EloGameResult.LOSE));
        Assertions.assertEquals(-5, EloUtil.getRatingChange(690.85, 500, 20, EloGameResult.TIE));
    }
}