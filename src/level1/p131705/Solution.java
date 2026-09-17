package level1.p131705;

/// [삼총사](https://school.programmers.co.kr/learn/courses/30/lessons/131705)
class Solution {
    public int solution(int[] number) {
        boolean[] visited = new boolean[number.length];

        return count(number, 0, 3, 0);
    }

    private int count(int[] arr, int start, int r, int sum) {
        if (r == 0) {
            return sum == 0 ? 1 : 0;
        }
        int count = 0;
        for (int i = start; i < arr.length; i++) {
            count += count(arr, i + 1, r - 1, sum + arr[i]);
        }
        return count;
    }
}
