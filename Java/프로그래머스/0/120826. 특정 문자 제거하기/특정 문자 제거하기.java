class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) == letter.charAt(0)){
                continue;
            }else{
                answer += String.valueOf(my_string.charAt(i));
            }
        }
        return answer;
    }
}