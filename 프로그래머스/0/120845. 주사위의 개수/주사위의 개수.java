class Solution {
    public int solution(int[] box, int n) {
        int width = box[0] / n;
        int height = box[1] / n;
        int depth = box[2] / n;
        
        int answer = width * height * depth;
        
        return answer;
    }
}
