class Solution {
     public int solution(int i, int j, int k) {
        int answer = 0;
        String s;
        for (int current = i; current <= j; current++) {
            s = String.valueOf(current);
            for (int n = 0; n < s.length(); n++) {
                if (s.charAt(n) - '0' == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}