class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c >= 'A' && c <= 'Z') {
                char shifted = (char)((c - 'A' + n) % 26 + 'A');
                answer.append(shifted);
            } 
            else if (c >= 'a' && c <= 'z') {
                char shifted = (char)((c - 'a' + n) % 26 + 'a');
                answer.append(shifted);
            } 
            else {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}
