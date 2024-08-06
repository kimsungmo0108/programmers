class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] nums = new int[30];
        for(int i=0; i<strArr.length; i++){
            nums[strArr[i].length()-1] += 1;
        }
        for(int n : nums){
            answer = answer > n ? answer : n;
        }
        return answer;
    }
}