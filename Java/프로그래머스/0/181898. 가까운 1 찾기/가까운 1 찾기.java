class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        int index = -1;
        for(int i=idx; i<arr.length; i++){
            if(arr[i] == 1){
                index = i;
                break;
            }
        }
        if(index >= idx){
            answer = index;
        }
        return answer;
    }
}