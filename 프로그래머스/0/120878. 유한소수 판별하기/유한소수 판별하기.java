class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        int gcd = getGCD(a, b);
        b /= gcd;

        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;

        answer = b == 1 ? 1 : 2;
        return answer;
    }

    private int getGCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
