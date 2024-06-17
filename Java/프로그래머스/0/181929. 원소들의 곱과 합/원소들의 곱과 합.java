class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int n = 1;  // 곱셈 결과를 저장할 변수, 1로 초기화
        int sum = 0;  // 합을 저장할 변수, 0으로 초기화
        
        // 배열의 각 요소를 순회하면서 곱셈과 합을 계산
        for (int i = 0; i < num_list.length; i++) {
            n *= num_list[i];
            sum += num_list[i];
        }
        
        // 합의 제곱 계산
        int m = sum * sum;
        
        answer = n < m ? 1 : 0;
        // 곱셈 결과가 합의 제곱보다 작으면 1, 그렇지 않으면 0 반환
        return answer;
    }
}