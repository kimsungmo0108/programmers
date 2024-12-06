class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] position = {0, 0};
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (position[1] < maxY) {
                        position[1]++;
                    }
                    break;
                case "down":
                    if (position[1] > -maxY) {
                        position[1]--;
                    }
                    break;
                case "left":
                    if (position[0] > -maxX) {
                        position[0]--;
                    }
                    break;
                case "right":
                    if (position[0] < maxX) {
                        position[0]++;
                    }
                    break;
            }
        }
        return position;
    }
}
