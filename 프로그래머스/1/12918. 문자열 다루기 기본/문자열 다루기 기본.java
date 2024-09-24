class Solution {
    public boolean solution(String s) {
        int len = s.length();
        
        // 길이가 4 또는 6이어야 함
        if (len != 4 && len != 6) {
            return false;
        }
        
        // 모든 문자가 숫자인지 확인
        for (int i = 0; i < len; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;  // 숫자가 아닌 문자가 있으면 false 반환
            }
        }
        
        return true;  // 모든 조건을 만족하면 true 반환
    }
}
