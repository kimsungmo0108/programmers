import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        // 첫 번째 요소는 항상 리스트에 추가
        list.add(arr[0]);
        
        // 배열의 1번째 요소부터 마지막 요소까지 반복
        for (int i = 1; i < arr.length; i++) {
            // 이전 요소와 현재 요소가 다르면 리스트에 추가
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        
        // 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
