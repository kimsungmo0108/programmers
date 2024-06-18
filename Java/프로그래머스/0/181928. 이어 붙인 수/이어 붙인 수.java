class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String s1 = "";
        String s2 = "";
        for(int i : num_list){
            if(i%2 == 0){
                s1 += String.valueOf(i);
            }else{
                s2 += String.valueOf(i);
            }
        }
        answer = Integer.valueOf(s1) + Integer.valueOf(s2);
        return answer;
    }
}