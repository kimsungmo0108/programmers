class Solution {
    public long solution(long n) {
        long answer = -1;
        
        // n의 제곱근까지만 검사
        long sqrt = (long)Math.sqrt(n);
        
        // 정확한 제곱근인지 확인
        if (sqrt * sqrt == n) {
            answer = (sqrt + 1) * (sqrt + 1);
        }
        
        return answer;
    }
}
