import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        // 'x'로 분리된 문자열을 배열에 저장하고 빈 문자열은 제외
        String[] answer = Arrays.stream(myString.split("x"))
                                .filter(s -> !s.isEmpty())
                                .toArray(String[]::new);
        
        // 사전순으로 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}
