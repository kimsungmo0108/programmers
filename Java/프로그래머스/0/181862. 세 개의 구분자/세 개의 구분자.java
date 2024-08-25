import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        // "a", "b", "c" 중 하나가 나오면 split
        String[] parts = myStr.split("[abc]");
        List<String> result = new ArrayList<>();
        
        for (String part : parts) {
            if (!part.isEmpty()) {
                result.add(part);
            }
        }
        
        // 결과가 비어있는 경우 "EMPTY"를 반환
        if (result.isEmpty()) {
            return new String[] {"EMPTY"};
        }
        
        return result.toArray(new String[0]);
    }
}
