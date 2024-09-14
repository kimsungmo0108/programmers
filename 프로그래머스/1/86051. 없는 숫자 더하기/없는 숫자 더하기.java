class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] nums = new int[10];
        for(int i=0; i<numbers.length; i++){
            nums[numbers[i]] += 1;
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j] == 0){
                answer += j;
            }
        }
        return answer;
    }
}