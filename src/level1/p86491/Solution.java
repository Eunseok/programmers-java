package level1.p86491;

///[최소직사각형](https://school.programmers.co.kr/learn/courses/30/lessons/86491)
class Solution {
    public int solution(int[][] sizes) {

        int minBase = 0;
        int minHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length; j++) {
                int min = Math.min(sizes[i][0], sizes[i][1]);
                int max = Math.max(sizes[i][0], sizes[i][1]);
                minBase = Math.max(minBase, min);
                minHeight = Math.max(minHeight, max);
            }
        }

        return minBase * minHeight;
    }
}