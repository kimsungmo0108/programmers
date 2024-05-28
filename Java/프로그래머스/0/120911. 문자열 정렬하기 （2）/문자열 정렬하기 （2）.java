class Solution {
    public String solution(String my_string) {
        String str = "";
        
        // 문자열을 소문자로 변환
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                str += (char)(c - 'A' + 'a');
            } else {
                str += c;
            }
        }
        
        // 문자열을 문자 배열로 변환하여 정렬
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        
        // 정렬된 문자 배열을 문자열로 변환
        String answer = new String(charArray);
        
        return answer;
    }
}
