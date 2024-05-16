class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        answer = n/slice;
        int a = n%slice;
        if(a>0){
            answer+=1;
        }
        return answer;
    }
}