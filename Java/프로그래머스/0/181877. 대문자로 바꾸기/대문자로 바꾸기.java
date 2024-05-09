class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)>='a' && myString.charAt(i)<='z'){
                answer += String.valueOf((char)(myString.charAt(i)-'a'+'A'));
            }else{
                answer += String.valueOf(myString.charAt(i));
            }
        }
        return answer;
    }
}