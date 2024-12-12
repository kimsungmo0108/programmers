class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupons = chicken;

        while (coupons >= 10) {
            int service = coupons / 10;
            answer += service;
            coupons = (coupons % 10) + service;
        }

        return answer;
    }
}
