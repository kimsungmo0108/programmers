class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = n/7;
        answer = a;
        if(n%7 > 0){
            answer+=1;
        }
        
        return answer;
    }
}