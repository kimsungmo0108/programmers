class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String afterA = A;
        int len = A.length();
        
        for (; answer < len; answer++) {
            if (afterA.equals(B)) {
                return answer;
            }
            afterA = afterA.charAt(len - 1) + afterA.substring(0, len - 1);
        }
        
        return -1;
    }
}
