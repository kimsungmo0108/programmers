import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
                result.add(num);
            }
            if (result.size() == k) {
                break;
            }
        }
        
        while (result.size() < k) {
            result.add(-1);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}
