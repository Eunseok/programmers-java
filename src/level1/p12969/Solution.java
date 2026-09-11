package level1.p12969;

import java.util.Scanner;

/// [직사각형 별찍기](https://school.programmers.co.kr/learn/courses/30/lessons/12969)
class Solution {
    public void solution(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}