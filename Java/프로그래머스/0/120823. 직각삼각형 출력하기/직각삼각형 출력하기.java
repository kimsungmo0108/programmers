import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 사용자로부터 정수 입력 받기

        // 삼각형을 그리기 위한 반복문
        for (int i = 1; i <= n; i++) {
            // 각 줄에 i개의 "*" 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈
        }
    }
}
