class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();  // 문자열을 효율적으로 만들기 위해 StringBuilder 사용
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer.append("수");  // 짝수 인덱스일 때는 "수"
            } else {
                answer.append("박");  // 홀수 인덱스일 때는 "박"
            }
        }
        return answer.toString();  // StringBuilder를 문자열로 변환하여 리턴
    }
}
