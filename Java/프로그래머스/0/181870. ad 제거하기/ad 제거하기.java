class Solution {
    public String[] solution(String[] strArr) {
        int len=0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                continue;
            }else{
                len++;
            }
        }
        String[] answer = new String[len];
        int j=0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                continue;
            }else{
                answer[j] = strArr[i];
                j++;
            }
        }
        return answer;
    }
}