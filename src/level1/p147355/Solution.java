package level1.p147355;

/// [크키가 작은 부분 문자열](https://school.programmers.co.kr/learn/courses/30/lessons/147355)
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        int tLen = t.length();

        for (int i = 0; i < tLen - pLen + 1; i++) {
            String subString = t.substring(i, i + pLen);
            if (subString.compareTo(p) <= 0)
                answer++;
        }

        return answer;
    }
}