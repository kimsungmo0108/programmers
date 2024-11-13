class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] abc = new int[26];
        
        for (int i = 0; i < 26; i++) {
            abc[i] = -1;
        }
        
        char c = ' ';
        int index = 0;
        
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            index = c - 'a';
            
            if(abc[index] == -1){
                answer[i] = -1;
            }else{
                answer[i] = i - abc[index];
            }
            
            abc[index] = i;
        }
        
        return answer;
    }
}