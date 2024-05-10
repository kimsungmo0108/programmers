class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        Boolean b = myString.contains(pat);
        if(b == true){
            answer = 1;
        }
        return answer;
    }
}