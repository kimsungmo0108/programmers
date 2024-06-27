class Solution {
    public String solution(String n_str) {
        String answer = "";
        int index = -1;
        for (int i = 0; i < n_str.length(); i++) { // 문자열 길이로 수정
            if (n_str.charAt(i) == '0') {
                index = i;
            } else {
                break;
            }
        }
        answer = n_str.substring(index + 1); // index + 1로 수정
        return answer;
    }
}
