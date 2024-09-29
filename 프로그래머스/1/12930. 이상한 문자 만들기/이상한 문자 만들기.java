class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();  // 결과를 담을 StringBuilder
        String[] words = s.split(" ", -1);  // 공백을 기준으로 단어로 나눔. "-1"은 연속된 공백도 유지

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (j % 2 == 0) {
                    // 짝수 인덱스 -> 대문자
                    answer.append(Character.toUpperCase(c));
                } else {
                    // 홀수 인덱스 -> 소문자
                    answer.append(Character.toLowerCase(c));
                }
            }
            if (i < words.length - 1) {
                answer.append(" ");  // 단어 사이에 공백 추가
            }
        }
        
        return answer.toString();
    }
}
