class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num = 0;
        for(int i=0; i<num_list.length; i++){
            num = num_list[i];
            for(;;){
                if(num == 1){
                    break;
                }else{
                    if(num%2 == 0){
                        num /= 2;
                        answer += 1;
                    }else if(num%2 == 1){
                        num = (num-1) / 2;
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }
}