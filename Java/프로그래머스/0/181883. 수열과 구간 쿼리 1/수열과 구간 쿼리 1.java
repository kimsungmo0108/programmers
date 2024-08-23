class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries 배열을 순회하며 각 쿼리에 대해 arr 배열을 업데이트
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            // s부터 e까지의 인덱스에 대해 1씩 더함
            for (int i = s; i <= e; i++) {
                arr[i]++;
            }
        }
        // 수정된 arr 배열을 반환
        return arr;
    }
}
