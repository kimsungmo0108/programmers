class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            if(i % 2 == 0) {
                answer[i] = "";
                for(int j = 0; j < strArr[i].length(); j++) {
                    if(strArr[i].charAt(j) >= 'A' && strArr[i].charAt(j) <= 'Z') {
                        answer[i] += String.valueOf((char)(strArr[i].charAt(j) - 'A' + 'a'));
                    } else {
                        answer[i] += String.valueOf((char)(strArr[i].charAt(j)));
                    }
                }
            } else if(i % 2 != 0) {
                 answer[i] = "";
                for(int j = 0; j < strArr[i].length(); j++) {
                    if(strArr[i].charAt(j) >= 'a' && strArr[i].charAt(j) <= 'z') {
                        answer[i] += String.valueOf((char)(strArr[i].charAt(j) - 'a' + 'A'));
                    } else {
                        answer[i] += String.valueOf((char)(strArr[i].charAt(j)));
                    }
                }
            }
        }
        return answer;
    }
}
