class Solution {
    public int[] solution(int n) {
        int c = 0;
        // 약수의 개수를 세는 반복문
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        
        int[] answer = new int[c];
        int index = 0;
        // 약수를 배열에 저장하는 반복문
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index++] = i;
            }
        }
        
        return answer;
    }
}
