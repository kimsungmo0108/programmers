import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
                i++;
            } else if (stk.peek() == arr[i]) {
                stk.pop();
                i++;
            } else {
                stk.push(arr[i]);
                i++;
            }
        }
        
        if (stk.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] result = new int[stk.size()];
            for (int j = 0; j < result.length; j++) {
                result[j] = stk.get(j);
            }
            return result;
        }
    }
}
