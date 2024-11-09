class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]);

        for (int i = 1; i < str.length; i += 2) {
            String operator = str[i];
            int number = Integer.parseInt(str[i + 1]);

            if (operator.equals("+")) {
                answer += number;
            } else if (operator.equals("-")) {
                answer -= number;
            }
        }
        
        return answer;
    }
}
