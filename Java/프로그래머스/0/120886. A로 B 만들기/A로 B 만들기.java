import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        // 문자열을 char 배열로 변환 후 정렬
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();
        
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        
        // 정렬된 char 배열을 다시 문자열로 변환하여 비교
        if (Arrays.equals(beforeArray, afterArray)) {
            return 1;
        } else {
            return 0;
        }
    }
}
