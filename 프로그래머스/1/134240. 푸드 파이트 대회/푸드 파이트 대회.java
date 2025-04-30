class Solution {
    public String solution(int[] food) {
        String left = "";
        
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                left += i;
            }
        }

        String right = new StringBuilder(left).reverse().toString();
        return left + "0" + right;
    }
}
