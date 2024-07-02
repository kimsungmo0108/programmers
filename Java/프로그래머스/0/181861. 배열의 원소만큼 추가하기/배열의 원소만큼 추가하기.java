class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        for(int i=0; i<arr.length; i++){
            len += arr[i];
        }
        int[] answer = new int[len];
        int j = 0;
        for(int i=0; i<arr.length; i++){
            for(int k=0; k<arr[i]; k++){
                answer[j] = arr[i];
                j++;
            }
        }
        return answer;
    }
}