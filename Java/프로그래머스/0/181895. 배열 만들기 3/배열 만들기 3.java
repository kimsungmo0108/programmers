class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[(intervals[0][1] - intervals[0][0])
                               +(intervals[1][1] - intervals[1][0])
                               +2];
        int j=0;
        for(int i=intervals[0][0]; i<=intervals[0][1]; i++){
            answer[j] = arr[i];
            j++;
        }
        for(int i=intervals[1][0]; i<=intervals[1][1]; i++){
            answer[j] = arr[i];
            j++;
        }
        return answer;
    }
}