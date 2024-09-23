import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 문자열을 문자 배열로 변환
        char[] arr = s.toCharArray();
        
        // 문자 배열을 정렬 (오름차순으로 정렬되며, 대문자가 소문자보다 작게 처리됨)
        Arrays.sort(arr);
        
        // 정렬된 배열을 역순으로 StringBuilder에 append
        StringBuilder answer = new StringBuilder(new String(arr));
        
        // 역순으로 변환하여 결과 반환
        return answer.reverse().toString();
    }
}
