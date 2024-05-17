class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cur = 0;
        int index = (array.length/2);
        
        for(int j= 0; j<array.length-1; j++){
            for(int i=0; i<array.length-1; i++){
                cur = array[i];
                if(array[i] > array[i+1]){
                    array[i] = array[i+1];
                    array[i+1] = cur;
                }
            }
        }
        
        answer = array[index];
        return answer;
    }
}