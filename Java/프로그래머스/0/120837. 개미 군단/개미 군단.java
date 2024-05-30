class Solution {
    public int solution(int hp) {
        int answer = 0;
        // 5로 나눈 몫을 더하고, 나머지 값을 계산
        answer += hp / 5;
        hp %= 5;
        // 3으로 나눈 몫을 더하고, 나머지 값을 계산
        answer += hp / 3;
        hp %= 3;
        // 남은 hp를 1로 처리
        answer += hp;
        return answer;
    }
}
