class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int height = 3; height <= total / 3; height++) {
            int width = total / height;

            if (total % height == 0 && width >= height) {
                int innerYellow = (width - 2) * (height - 2);
                if (innerYellow == yellow) {
                    return new int[]{width, height};
                }
            }
        }
        return new int[0];
    }
}
