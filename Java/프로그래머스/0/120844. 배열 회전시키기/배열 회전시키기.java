class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if (direction.equals("right")) {
            // 배열의 마지막 요소를 첫 번째 위치로 이동
            answer[0] = numbers[numbers.length - 1];
            // 나머지 요소들을 오른쪽으로 한 칸 이동
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
        } else if (direction.equals("left")) {
            // 배열의 첫 번째 요소를 마지막 위치로 이동
            answer[answer.length - 1] = numbers[0];
            // 나머지 요소들을 왼쪽으로 한 칸 이동
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
        }
        
        return answer;
    }
}
