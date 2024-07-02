class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int temp = 0;
        for(int j=0; j<num_list.length-1; j++){
            for(int i=0; i<num_list.length-1; i++){
                if(num_list[i] > num_list[i+1]){
                    temp = num_list[i];
                    num_list[i] = num_list[i+1];
                    num_list[i+1] = temp;
                }
            }
        }
        for(int i=0; i<5; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}