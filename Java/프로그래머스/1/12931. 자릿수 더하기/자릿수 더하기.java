import java.util.*;

public class Solution {
    public int solution(int n) {
        String str = String.valueOf(n);
        int answer = 0;
        
        for(int i=0; i<str.length(); i++){
            answer += str.charAt(i) - '0';
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.printf("%s, %d", str, answer);

        return answer;
    }
}