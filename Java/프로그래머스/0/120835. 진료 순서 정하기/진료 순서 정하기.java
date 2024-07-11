import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(int[] emergency) {
        int[] sortedEmergency = emergency.clone();
        Arrays.sort(sortedEmergency);
    
        Map<Integer, Integer> emergencyToRank = new HashMap<>();
        for (int i = 0; i < sortedEmergency.length; i++) {
            emergencyToRank.put(sortedEmergency[i], sortedEmergency.length - i);
        }
        
        int[] result = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            result[i] = emergencyToRank.get(emergency[i]);
        }
        
        return result;
    }
}