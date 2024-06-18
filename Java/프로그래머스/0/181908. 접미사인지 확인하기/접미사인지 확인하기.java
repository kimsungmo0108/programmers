class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int len = my_string.length() - is_suffix.length();
        if(len<0){
            return answer;
        }
        String str = my_string.substring(len);
        if(str.equals(is_suffix)){
            answer = 1;
        }
        return answer;
    }
}