class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int len = my_string.length() - n;
        answer = my_string.substring(len);
        return answer;
    }
}