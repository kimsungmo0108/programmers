import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> topScores = new ArrayList<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            topScores.add(score[i]);
            Collections.sort(topScores, Collections.reverseOrder());

            if (topScores.size() > k) {
                topScores.remove(topScores.size() - 1);
            }

            answer[i] = topScores.get(topScores.size() - 1);
        }

        return answer;
    }
}