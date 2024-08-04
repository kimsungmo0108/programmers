class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int len = included.length;
        for(int i=0; i<len; i++){
            if(included[i]){
                answer += a + (i * d);
            }
        }
        return answer;
    }
}