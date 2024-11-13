class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int m = 0;
        while(n >= a){
            m = (n / a) * a;
            n = n - m + ((m / a) * b);
            answer += (m / a) * b;
        }
        return answer;
    }
}