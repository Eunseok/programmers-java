package level1.p81301;

import java.util.Map;

/// [숫자 문자열과 영단어](https://school.programmers.co.kr/learn/courses/30/lessons/81301)
class Solution {

    private final Map<String, String> map = Map.of(
            "zero", "0",
            "one", "1",
            "two", "2",
            "three", "3",
            "four", "4",
            "five", "5",
            "six", "6",
            "seven", "7",
            "eight", "8",
            "nine", "9"
    );

    public int solution(String s) {
        int answer = 0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            s = s.replace(key, value);
        }

        return Integer.parseInt(s);
    }
}
