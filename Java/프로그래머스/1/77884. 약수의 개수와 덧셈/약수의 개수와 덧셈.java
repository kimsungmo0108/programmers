class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            // i가 제곱수인지 확인 (i의 제곱근이 정수인지 확인)
            if (Math.sqrt(i) == (int)Math.sqrt(i)) {
                answer -= i;  // 약수의 개수가 홀수인 경우 (제곱수) 빼기
            } else {
                answer += i;  // 약수의 개수가 짝수인 경우 더하기
            }
        }
        
        return answer;
    }
}
