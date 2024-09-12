class Solution {
    public int solution(int num) {
        int answer = 0;
        int collatz = num;
        for(int i=0; collatz != 1;i++){
            if(collatz%2 == 0){
                collatz /= 2;
            }else if(collatz%2 == 1){
                collatz = (collatz * 3) + 1;
            }
            answer = i+1;
            if(i >= 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}