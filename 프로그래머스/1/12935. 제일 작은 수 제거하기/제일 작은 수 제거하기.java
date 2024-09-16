class Solution {
    public int[] solution(int[] arr) {
        // 길이가 1일 경우 -1을 반환
        if(arr.length == 1){
            return new int[]{-1};
        }

        // 최소값 찾기
        int min = arr[0];
        for(int i : arr){
            min = Math.min(min, i);
        }

        // 최소값을 제외한 배열 생성
        int[] answer = new int[arr.length - 1];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min){
                answer[j++] = arr[i];
            }
        }
        
        return answer;
    }
}
