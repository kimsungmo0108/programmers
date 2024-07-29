class Solution {
    public int solution(String my_string) {
        int sum = 0;
        int currentNumber = 0;
        boolean isNumber = false;

        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
                isNumber = true;
            } else {
                if (isNumber) {
                    sum += currentNumber;
                    currentNumber = 0;
                    isNumber = false;
                }
            }
        }

        // 마지막에 남은 숫자를 더해줍니다.
        if (isNumber) {
            sum += currentNumber;
        }

        return sum;
    }
}
