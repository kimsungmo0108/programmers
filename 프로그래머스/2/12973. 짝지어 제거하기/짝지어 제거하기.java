class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == s.charAt(i)) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }

        answer = (sb.length() == 0) ? 1 : 0;
        return answer;
    }
}
