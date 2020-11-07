package step3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import step3.domain.Racing;
import step3.view.InputView;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Created By mand2 on 2020-11-04.
 */
public class RacingTest {

    @Test
    @DisplayName("경주할 차가 0일 때")
    public void 경주_테스트_1() {
        assertThatThrownBy(() -> Racing.of(0, 3))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("경기의 수가 0일 때")
    public void 경주_테스트_2() {
        assertThatThrownBy(() -> Racing.of(3, 0))
                .isInstanceOf(IllegalArgumentException.class);
    }

}