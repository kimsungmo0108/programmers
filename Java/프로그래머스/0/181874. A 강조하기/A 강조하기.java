class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            if (c == 'a') {
                result.append('A');
            } else if (c >= 'A' && c <= 'Z' && c != 'A') {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }
        
        answer = result.toString();
        
        return answer;
    }
}