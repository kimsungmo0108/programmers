class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum1 = "";
        sum1 += a;
        sum1 += b;
        int sum2 = Integer.valueOf(sum1);
        int sum3 = 2 * a * b;
        answer = sum2>sum3 ? sum2:sum3;
        return answer;
    }
}