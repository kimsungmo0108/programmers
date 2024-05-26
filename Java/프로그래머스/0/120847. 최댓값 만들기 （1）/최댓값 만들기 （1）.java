class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int m1 = -1;
        int m2 = -2;
        int index = -1;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > m1){
                m1 = numbers[i];
                index = i;
            }
        }
        for(int i=0; i<numbers.length; i++){
            if(index == i){
                continue;
            }
            if(numbers[i] > m2){
                m2 = numbers[i];
            }
        }
        answer = m1 * m2;
        return answer;
    }
}