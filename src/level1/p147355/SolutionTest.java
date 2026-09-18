package level1.p147355;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "3141592, 271, 2",
            "500220839878, 7, 8",
            "10203, 15, 3"
    })
    public void solutionTest(String t, String  p, int expected) {
        Solution solution = new Solution();

        int actual = solution.solution(t, p);

        assertEquals(expected, actual);
    }

}