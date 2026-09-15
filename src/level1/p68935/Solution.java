package level1.p68935;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


/// [3진법 뒤집기](https://school.programmers.co.kr/learn/courses/30/lessons/68935)
/// 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n, 3);
        String revered = new StringBuilder(ternary).reverse().toString();
        return Integer.parseInt(revered, 3);
    }

    @ParameterizedTest
    @CsvSource({
            "45, 7",
            "125, 229"})
    void solutionTest(int input, int expect) {
        assertEquals(expect, solution(input));
    }
}