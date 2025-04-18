class Solution {
    public int[] solution(int l, int r) {
        String[] q = new String[10000];
        int[] result = new int[10000];
        int front = 0, rear = 0, count = 0;

        q[rear++] = "5";

        while (front < rear) {
            String s = q[front++];
            int n = Integer.parseInt(s);

            if (n > r) continue;
            if (n >= l) result[count++] = n;

            q[rear++] = s + "0";
            q[rear++] = s + "5";
        }

        if (count == 0) return new int[]{-1};

        int[] answer = new int[count];
        System.arraycopy(result, 0, answer, 0, count);
        return answer;
    }
}