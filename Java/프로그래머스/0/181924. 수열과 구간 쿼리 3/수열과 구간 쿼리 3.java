class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries 배열을 순회하며 각 쿼리에 대해 arr 배열의 값을 스왑
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            // arr[i]와 arr[j]의 값을 교환
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // 수정된 arr 배열을 반환
        return arr;
    }
}
