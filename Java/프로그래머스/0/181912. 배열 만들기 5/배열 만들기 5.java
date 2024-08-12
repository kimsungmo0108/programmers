import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for (String numStr : intStrs) {
            String str = numStr.substring(s, s + l);
            int num = Integer.parseInt(str);
            if (num > k) {
                list.add(num);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}