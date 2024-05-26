class Solution {
    public int solution(int n) {
        int answer = 0;
        String n1 = String.valueOf(n);
        for(int i=0; i<n1.length(); i++){
            if(n1.charAt(i)>='0' && n1.charAt(i)<='9'){
                answer += Integer.valueOf(n1.charAt(i)-'0');
            }
        }
        return answer;
    }
}