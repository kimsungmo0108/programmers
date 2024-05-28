class Solution {
    public int[] solution(String my_string) {
        int c=0;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9'){
                c++;
            }
        }
        int[] answer = new int[c];
        int k=0;
        for(int j=0; j<my_string.length(); j++){
            if(my_string.charAt(j)>='0' && my_string.charAt(j)<='9'){
                answer[k++] = (int)(my_string.charAt(j) - '0');
            }
        }
        int t = -1;
        for(int j=0; j<c; j++){
            for(int i=0; i<c-1; i++){
                if(answer[i] > answer[i+1]){
                    t = answer[i];
                    answer[i] = answer[i+1];
                    answer[i+1] = t;
                }
            }
        }
        return answer;
    }
}