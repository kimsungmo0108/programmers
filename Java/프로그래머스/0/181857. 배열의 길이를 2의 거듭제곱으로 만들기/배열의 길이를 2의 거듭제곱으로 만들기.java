import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        
        // 현재 길이보다 크거나 같은 가장 작은 2의 거듭제곱을 찾음
        int targetLength = 1;
        while (targetLength < length) {
            targetLength *= 2;
        }
        
        // 새 배열을 생성하고 기존 배열 복사
        int[] result = Arrays.copyOf(arr, targetLength);
        
        return result;
    }
}