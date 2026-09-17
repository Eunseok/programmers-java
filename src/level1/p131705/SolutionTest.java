package level1.p131705;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @DisplayName("삼총사 조합 개수를 구한다")
    @ParameterizedTest(name = "[{index}] number={0} → expected={1}")
    @MethodSource("provideTestCases")
    void solution(int[] number, int expected) {
        assertEquals(expected, solution.solution(number));
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{-2, 3, 0, 2, -5}, 2),
                Arguments.of(new int[]{-3, -2, -1, 0, 1, 2, 3}, 5),
                Arguments.of(new int[]{-1, 1, -1, 1}, 0)
        );
    }
}