class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        int temp = d[0];
        int t=0;
        for (int i = 0; i < d.length - 1; i++) {
            for (int j = 0; j < d.length - 1 - i; j++) {
                if (d[j] > d[j + 1]) {
                    temp = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = temp;
                }
            }
        }
        
        int sum = 0;
        for(int i=0; i<d.length; i++){
            if(sum < budget){
                sum += d[i];
                answer++;
                if(sum > budget){
                    answer--;
                }
            }
        }

        return answer;
    }
}