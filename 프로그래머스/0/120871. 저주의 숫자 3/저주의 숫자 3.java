class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for(int i=1; count<n; i++){
            if(i % 3 == 0 || String.valueOf(i).contains("3")){
                continue;
            }
            count++;
            answer = i;
        }
        
        return answer;
    }
}