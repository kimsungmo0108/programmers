class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer += my_string.substring(0, s);
        answer += overwrite_string;
        
        int len = my_string.length() - answer.length();
        if(len != 0){
            for(int i=answer.length(); i<my_string.length(); i++){
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}