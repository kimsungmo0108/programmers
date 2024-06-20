import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        // 기존 num_list 길이를 구합니다.
        int n = num_list.length;
        
        // 마지막 원소와 그전 원소를 비교합니다.
        int lastElement = num_list[n - 1];
        int prevElement = num_list[n - 2];
        
        // 조건에 맞는 값을 계산합니다.
        int newElement;
        if (lastElement > prevElement) {
            newElement = lastElement - prevElement;
        } else {
            newElement = lastElement * 2;
        }
        
        // 새로운 배열을 생성하여 기존 배열의 요소를 복사하고 새로운 요소를 추가합니다.
        int[] newNumList = Arrays.copyOf(num_list, n + 1);
        newNumList[n] = newElement;
        
        return newNumList;
    }
}