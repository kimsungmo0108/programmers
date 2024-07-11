class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int c = 0;
        for(int i=0; i<finished.length; i++){
            if(finished[i] == false){
                c++;
            }
        }
        String[] answer = new String[c];
        int j=0;
        for(int i=0; i<finished.length; i++){
            if(finished[i] == false){
                answer[j] = todo_list[i];
                j++;
            }
        }
        return answer;
    }
}