class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {  // 짝수 인덱스
                even += num_list[i];
            } else {  // 홀수 인덱스
                odd += num_list[i];
            }
        }
        answer = even > odd ? even : odd;
        return answer;
    }
}
