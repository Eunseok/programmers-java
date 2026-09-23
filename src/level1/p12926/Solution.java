package level1.p12926;

///[시저 암호](https://school.programmers.co.kr/learn/courses/30/lessons/12926)
class Solution {

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer.append((char) ('A'+ (c - 'A' + n) % 26));
            } else if (Character.isLowerCase(c)) {
                answer.append((char) ('a'+ (c - 'a' + n) % 26));
            } else {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}
