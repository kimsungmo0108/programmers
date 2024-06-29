class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        int[] answer = new int[len];
        if(len%2 == 0){
            for(int i=0; i<len; i++){
                if((i+1)%2 == 0){
                    answer[i] = arr[i] + n;
                }else{
                    answer[i] = arr[i];
                }
            }
        }else if(len%2 == 1){
            for(int i=0; i<len; i++){
                if((i+1)%2 == 1){
                    answer[i] = arr[i] + n;
                }else{
                    answer[i] = arr[i];
                }
            }
        }
        return answer;
    }
}