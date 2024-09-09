class Solution {
    public boolean solution(int x) {
        String numStr = String.valueOf(x);
        int sum = 0;
        for(int i=0; i<numStr.length(); i++){
            sum += numStr.charAt(i) - '0';
        }
        boolean answer = true;
        if(x%sum != 0){
            answer = false;
        }
        return answer;
    }
}