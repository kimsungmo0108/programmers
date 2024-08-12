import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
                List<Integer> X = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                // arr[i]를 arr[i] * 2번 추가
                for (int j = 0; j < arr[i] * 2; j++) {
                    X.add(arr[i]);
                }
            } else {
                // X에서 마지막 arr[i]개의 원소 제거
                for (int j = 0; j < arr[i]; j++) {
                    if (!X.isEmpty()) {
                        X.remove(X.size() - 1);
                    }
                }
            }
        }
        
        // List를 배열로 변환
        int[] answer = new int[X.size()];
        for (int i = 0; i < X.size(); i++) {
            answer[i] = X.get(i);
        }
        
        return answer;
    }
}