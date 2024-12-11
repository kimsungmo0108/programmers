class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        double[] avg = new double[n];
        int rank = 0;
        
        for(int i=0; i<n; i++){
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        for(int i=0; i<n; i++){
            rank = 1;
            for(int j=0; j<n; j++){
                if(avg[i] < avg[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}