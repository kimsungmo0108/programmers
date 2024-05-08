class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)>='A' && myString.charAt(i)<='Z'){
                answer += String.valueOf((char)(myString.charAt(i)-'A'+'a'));
            }else{
                answer += String.valueOf(myString.charAt(i));
            }
        }
        return answer;
    }
}