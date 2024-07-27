class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int i=0; i<array.length; i++){
            str = String.valueOf(array[i]);
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == '7'){
                    answer += 1;
                }
            }
        }
        return answer;
    }
}