class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int size = (len + n - 1) / n;
        
        String[] answer = new String[size];
        
        int end = 0;
        int start = 0;
        for (int i = 0; i < size; i++) {
            start = i * n;
            if((start + n) > len){
                end = len;
            }else{
                end = start + n;
            }
            
            answer[i] = my_str.substring(start, end);
        }
        
        return answer;
    }
}
