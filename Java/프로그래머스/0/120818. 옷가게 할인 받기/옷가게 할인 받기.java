public class Solution {
    public int solution(int price) {
        int answer = 0;
        if (price >= 100000 && price < 300000) {
            answer = (int)(price * 0.95);
        } else if (price >= 300000 && price < 500000) {
            answer = (int)(price * 0.9);
        } else if (price >= 500000) {
            answer = (int)(price * 0.8);
        } else { // 100,000 미만의 가격은 할인이 없음
            answer = price;
        }
        return answer;
    }
}
