class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int len = str.length();
        int[] answer = new int[len];
        int j = 0;
        for(int i=len-1; i>=0; i--){
            answer[j] = str.charAt(i) - '0';
            j++;
        }
        return answer;
    }
}