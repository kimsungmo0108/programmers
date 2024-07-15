class Solution {
    public String[] solution(String[] names) {
        int c = (names.length + 4) / 5;
        String[] answer = new String[c];
        int j=0;
        for(int i=0; i<names.length; i += 5){
            answer[j] = names[i];
            j++;
        }
        return answer;
    }
}