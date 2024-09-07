class Solution {
    public long solution(long n) {
        
        String str = String.valueOf(n);
        char[] charArray = str.toCharArray();
        char c;
        
        // 내림차순으로 문자 배열 정렬 (버블 정렬 방식)
        for(int j = 0; j < charArray.length; j++){
            for(int i = 0; i < charArray.length - 1; i++){
                if(charArray[i] < charArray[i + 1]){  // 내림차순 정렬
                    c = charArray[i];
                    charArray[i] = charArray[i + 1];
                    charArray[i + 1] = c;
                }
            }
        }
        
        // 문자 배열을 다시 문자열로 변환
        String answerStr = "";
        for(int i = 0; i < charArray.length; i++){
            answerStr += String.valueOf(charArray[i]);
        }
        
        // 문자열을 long 타입으로 변환
        long answer = Long.valueOf(answerStr);
        return answer;
    }
}
