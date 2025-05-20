class Solution {
    public long solution(int n) {
        long a = 1;
        long b = 1;
        
        for (int i = 2; i <= n; i++) {
            long temp = (a + b) % 1234567;
            a = b;
            b = temp;
        }
        
        return b;
    }
}
