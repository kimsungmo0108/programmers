class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행렬의 크기 (행의 개수와 열의 개수는 동일하다고 가정)
        int rows = arr1.length;      // 행의 개수
        int cols = arr1[0].length;   // 열의 개수
        
        // 결과를 저장할 배열 초기화
        int[][] answer = new int[rows][cols];
        
        // 행렬의 각 요소에 대해 더하기 연산 수행
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];  // 같은 위치의 요소끼리 더하기
            }
        }
        
        return answer;  // 결과 행렬 반환
    }
}
