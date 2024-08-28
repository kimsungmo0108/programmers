import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int[] prevArr;
        int x = 0;

        while (true) {
            prevArr = arr.clone(); // 이전 배열 상태를 복사
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            x++; // 반복 횟수 증가

            if (Arrays.equals(arr, prevArr)) {
                break; // 배열이 변하지 않으면 종료
            }
        }

        return x - 1; // x가 1부터 시작하므로 1을 빼줌
    }
}
