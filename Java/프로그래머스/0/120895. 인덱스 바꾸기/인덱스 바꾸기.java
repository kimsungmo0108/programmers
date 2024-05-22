class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(i == num1){
                answer += String.valueOf(my_string.charAt(num2));
            }else if(i == num2){
                answer += String.valueOf(my_string.charAt(num1));
            }else{
              answer += String.valueOf(my_string.charAt(i));  
            }
        }
        return answer;
    }
}