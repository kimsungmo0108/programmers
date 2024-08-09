class Solution {
    public int solution(int a, int b, int c) {
        int sum = a + b + c;
        int sumOfSquares = a * a + b * b + c * c;
        int sumOfCubes = a * a * a + b * b * b + c * c * c;

        if (a == b && b == c) {
            // 모두 같은 경우
            return sum * sumOfSquares * sumOfCubes;
        } else if (a == b || b == c || a == c) {
            // 두 숫자가 같고 나머지 하나는 다른 경우
            return sum * sumOfSquares;
        } else {
            // 모든 숫자가 다른 경우
            return sum;
        }
    }
}