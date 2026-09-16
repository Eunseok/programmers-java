package level1.p12930;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// [이상한 문자 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12930)
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toUpperCase().toCharArray();

        int idx = 0;
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if(charArray[i] != ' ') {
                ch = idx % 2 == 0 ? ch : (char)(ch-('A'-'a'));
                idx++;
            }
            else {
                idx = 0;
            }
            sb.append(ch);
        }

        return sb.toString();
    }

    @Test
    void solutionTest() {

        assertEquals("TrY HeLlO WoRlD", solution("try hello world"));
    }
}
