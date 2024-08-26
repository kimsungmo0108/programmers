class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int k = query[2];
            for(int i=query[0]; i<=query[1]; i++){
                if(i%k == 0){
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }
}