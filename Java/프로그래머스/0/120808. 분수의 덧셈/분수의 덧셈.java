class Solution {
    // 최대 공약수를 구하는 메소드 (유클리드 호제법)
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 두 분수를 더함
        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;
        
        // 최대 공약수를 구함
        int gcdValue = gcd(numerator, denominator);
        
        // 기약 분수로 만듦
        int[] answer = { numerator / gcdValue, denominator / gcdValue };
        return answer;
    }
}
