class Solution {
    public int solution(String number) {
        int sum = 0;
        for (char digit : number.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        int answer = sum % 9;
        return answer;
    }
}
