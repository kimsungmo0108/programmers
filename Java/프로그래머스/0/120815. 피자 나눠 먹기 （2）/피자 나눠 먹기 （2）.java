class Solution {
    public int solution(int n) {
        int gcd = gcd(n, 6); // n과 6의 GCD를 구함
        int lcm = (n * 6) / gcd; // LCM을 구하는 공식
        return lcm / 6; // 최소 피자 판 수를 구함
    }
    
    // 최대 공약수를 구하는 유클리드 호제법
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
