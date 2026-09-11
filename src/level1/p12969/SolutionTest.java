package level1.p12969;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution s = new Solution();

        // 입력 준비
        String input = "5 3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // 출력 캡처 준비
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        try {
            s.solution(new String[]{});

            // 여기서 출력 결과를 검증
            assertEquals("""
                *****
                *****
                *****
                """, output.toString());

        } finally {
            System.setIn(System.in);
            System.setOut(System.out);
        }
    }
}