import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        // 문자열을 BigInteger로 변환
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        
        // 두 수를 더한 값을 저장
        BigInteger sum = num1.add(num2);
        
        // 결과를 문자열로 변환하여 반환
        return sum.toString();
    }
}
