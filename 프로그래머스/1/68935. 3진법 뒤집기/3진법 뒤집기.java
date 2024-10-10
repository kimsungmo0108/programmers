class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s1 = "";
        int n1 = n;
        for(; n1>0;){
            s1 += String.valueOf(n1%3);
            n1 /= 3;
        }
        
        int j = 1;
        for(int i=s1.length()-1; i>=0; i--){
            answer += (s1.charAt(i)-'0') * j;
            j *= 3;
        }
        
        return answer;
    }
}