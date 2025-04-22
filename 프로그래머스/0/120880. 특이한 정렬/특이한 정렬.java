class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int diffI = Math.abs(numlist[i] - n);
                int diffJ = Math.abs(numlist[j] - n);

                if (diffI > diffJ || (diffI == diffJ && numlist[i] < numlist[j])) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }

        return numlist;
    }
}
