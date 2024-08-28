import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                // "l"을 기준으로 왼쪽에 있는 문자열을 추가
                for(int j = 0; j < i; j++) {
                    list.add(str_list[j]);
                }
                break;
            } else if(str_list[i].equals("r")) {
                // "r"을 기준으로 오른쪽에 있는 문자열을 추가
                for(int j = i + 1; j < str_list.length; j++) {
                    list.add(str_list[j]);
                }
                break;
            }
        }
        
        // 리스트를 배열로 변환하여 반환
        return list.toArray(new String[0]);
    }
}
