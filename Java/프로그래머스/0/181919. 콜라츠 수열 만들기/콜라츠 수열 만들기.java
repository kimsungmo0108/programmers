import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> sequence = new ArrayList<>();

        // 초기값 n을 수열에 추가
        sequence.add(n);

        // n이 1이 될 때까지 콜라츠 수열 생성
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            sequence.add(n);  // 변환된 값을 수열에 추가
        }

        // List<Integer>를 int[] 배열로 변환
        int[] answer = new int[sequence.size()];
        for (int i = 0; i < sequence.size(); i++) {
            answer[i] = sequence.get(i);
        }

        return answer;
    }
}