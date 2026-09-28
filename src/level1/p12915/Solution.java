package level1.p12915;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/// [문자열 내 마음대로 정렬하기](https://school.programmers.co.kr/learn/courses/30/lessons/12915)
class Solution {

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) != s2.charAt(n)) {
                return Character.compare(s1.charAt(n), s2.charAt(n));
            }
            return s1.compareTo(s2);
        });
        return strings;
    }


    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void solutionTest(String[] strings, int n, String[] expected) {
        String[] actual = solution(strings, n);

        assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new String[]{"sun", "bed", "car"}, 1, new String[]{"car", "bed", "sun"}),
                Arguments.of(new String[]{"abce", "abcd", "cdx"}, 2, new String[]{"abcd", "abce", "cdx"})
        );
    }
}