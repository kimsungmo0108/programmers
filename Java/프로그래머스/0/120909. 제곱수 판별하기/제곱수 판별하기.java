class Solution {
    public int solution(int n) {
        // n의 제곱근을 구함
        double sqrt = Math.sqrt(n);
        // 제곱근이 정수인지 확인
        if (sqrt == (int)sqrt) {
            return 1; // 제곱근이 정수이면 제곱수임
        } else {
            return 2; // 제곱근이 정수가 아니면 제곱수가 아님
        }
    }
}
