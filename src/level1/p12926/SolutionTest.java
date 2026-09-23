package level1.p12926;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "AB, 1, BC",
            "z, 1, a",
            "'a B z', 4, 'e F d'",
    })
    void setSolutionTest(String s, int n, String expected) {
        String actual = solution.solution(s, n);

        assertEquals(expected, actual);
    }
}