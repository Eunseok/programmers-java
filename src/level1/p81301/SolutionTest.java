package level1.p81301;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "one4seveneight, 1478",
            "23four5six7, 234567",
            "123, 123",
    })
    void setSolutionTest(String s, int expected) {
        int actual = solution.solution(s);

        assertEquals(expected, actual);
    }
}