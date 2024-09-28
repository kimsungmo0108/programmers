class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 최대공약수 구하기 (유클리드 호제법 사용)
        int gcd = gcd(n, m);
        
        // 최소공배수 구하기
        int lcm = (n * m) / gcd;
        
        // 결과 배열에 최대공약수와 최소공배수 저장
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
    
    // 유클리드 호제법을 이용한 최대공약수 함수
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
