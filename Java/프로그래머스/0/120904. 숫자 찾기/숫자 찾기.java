class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String n = String.valueOf(num);
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)-'0' == k){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}