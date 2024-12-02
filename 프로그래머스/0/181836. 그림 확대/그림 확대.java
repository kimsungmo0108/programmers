class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int index = 0;
        char c = ' ';
        String str = "";
        
        for (String row : picture) {
            for(int i=0; i<row.length(); i++){
                c = row.charAt(i);
                for(int j=0; j<k; j++){
                    str += String.valueOf(c);  
                }
            }
            
            for(int i=0; i<k; i++){
                answer[index++] = str;
            }
            str = "";
        }
        
        return answer;
    }
}