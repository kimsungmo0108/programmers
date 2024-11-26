class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        
        int maxSize = rows > cols ? rows : cols;
        
        int[][] answer = new int[maxSize][maxSize];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}
