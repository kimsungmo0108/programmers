class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int min = sides[0] < sides[1] ? sides[0] : sides[1];
        int count = 0;

        for(int i=max-min+1; i<=max; i++){
            answer++;
        }
        
        for(int j=max+1; j<max+min; j++){
            answer++;
        }
        
        return answer;
    }
}