class Solution {
    public int solution(int n) {
        int answer = 0;
        int mod = 1234567;
        int a = 0;
        int b = 1;
        int temp = 0;

        for (int i = 2; i <= n; i++) {
            temp = (a + b) % mod;
            a = b;
            b = temp;
        }

        answer = b;
        
        return answer;
    }
}
