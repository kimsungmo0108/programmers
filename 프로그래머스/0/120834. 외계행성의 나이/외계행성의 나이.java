class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = String.valueOf(age);
        char c;

        for(int i = 0; i < ageStr.length(); i++) {
            c = (char)(ageStr.charAt(i) + 49);
            answer += c;
        }

        return answer;
    }
}
