package level1.p12940;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/// [최대공약수와 최소공배수](https://school.programmers.co.kr/learn/courses/30/lessons/12940)
class Solution {
    public int[] solution(int n, int m) {
        int gdc = getGCD(n, m);
        int[] answer = {gdc, n / gdc * m};
        return answer;
    }

    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    @ParameterizedTest
    @CsvSource({
            "3, 12, 3, 12",
            "2, 5, 1, 10"
    })
    void gcd_lcm(int a, int b, int expectedGcd, int expectedLcm) {
        // when
        int[] result = solution(a, b);

        // then
        assertArrayEquals(
                new int[]{expectedGcd, expectedLcm},
                result
        );
    }
}