import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sums = new HashSet<>();
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                sum = numbers[i] + numbers[j];
                sums.add(sum);
            }
        }
        
        int[] answer = new int[sums.size()];
        int idx = 0;
        for (int s : sums) {
            answer[idx++] = s;
        }
        int t=0;
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer.length-1; j++){
               if(answer[j] > answer[j+1]){
                   t = answer[j];
                   answer[j] = answer[j+1];
                   answer[j+1] = t;
               } 
            }
        }
        
        return answer;
    }
}