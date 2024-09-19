class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        if(len%2 == 0){
            answer += String.valueOf(s.charAt(len/2-1));
            answer += String.valueOf(s.charAt(len/2));
        }else if(len%2 == 1){
            answer += String.valueOf(s.charAt(len/2));
        }
        return answer;
    }
}