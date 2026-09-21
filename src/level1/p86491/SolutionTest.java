package level1.p86491;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();


    @ParameterizedTest(name = "[{index}] sizes={0} → expected={1}")
    @MethodSource("provideTestCases")
    public void solution(int[][] sizes, int expected) {

        int actual = solution.solution(sizes);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}, 4000),
                Arguments.of(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}, 120),
                Arguments.of(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}, 133)
        );
    }
}