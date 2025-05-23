import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int max = 0;
        for (int t : tangerine) {
            if (t > max) max = t;
        }

        int[] sizeCount = new int[max + 1];
        for (int t : tangerine) {
            sizeCount[t]++;
        }

        List<Integer> counts = new ArrayList<>();
        for (int count : sizeCount) {
            if (count > 0) counts.add(count);
        }
        counts.sort(Collections.reverseOrder());

        int total = 0;
        int kinds = 0;
        for (int count : counts) {
            total += count;
            kinds++;
            if (total >= k) break;
        }

        return kinds;
    }
}
