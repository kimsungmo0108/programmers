class Solution {
    public String solution(String my_string, String alp) {
        String upperAlp = alp.toUpperCase();
        String answer = my_string.replaceAll(alp, upperAlp);
        return answer;
    }
}