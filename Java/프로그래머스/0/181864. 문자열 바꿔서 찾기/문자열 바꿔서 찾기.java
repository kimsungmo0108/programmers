class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'A'){
                str += String.valueOf('B');
            }else{
                str += String.valueOf('A');
            }
        }
        int answer = 0;
        if(str.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}