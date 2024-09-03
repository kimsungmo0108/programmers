class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double c = 0;
        int sum = 0;
        for(int num : arr){
            sum += num;
            c++;
        }
        answer = sum / c;
        return answer;
    }
}