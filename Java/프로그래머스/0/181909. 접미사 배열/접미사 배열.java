import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        // 접미사를 저장할 리스트 생성
        ArrayList<String> suffixes = new ArrayList<>();
        
        // 접미사 구하기
        for (int i = 0; i < my_string.length(); i++) {
            suffixes.add(my_string.substring(i));
        }
        
        // 접미사 사전순 정렬
        Collections.sort(suffixes);
        
        // 리스트를 배열로 변환하여 반환
        return suffixes.toArray(new String[0]);
    }
}