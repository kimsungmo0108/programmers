class Solution {
    public String solution(String s) {
        String answer = "";
        String[] nums = s.split(" ");
        int[] intNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            intNums[i] = Integer.parseInt(nums[i]);
        }
        
        int max = intNums[0];
        int min = intNums[0];
        
        for(int i : intNums) {
            max = max > i ? max : i;
        }

        for(int i : intNums) {
            min = min < i ? min : i;
        }

        answer += String.format("%s %s", String.valueOf(min), String.valueOf(max));
        return answer;
    }
}
