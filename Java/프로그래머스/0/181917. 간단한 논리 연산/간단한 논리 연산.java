class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean b1 = false;
        boolean b2 = false;
        if(x1 || x2){
            b1 = true;
        }
        if(x3 || x4){
            b2 = true;
        }
        if(b1 && b2){
            answer = true;
        }
        
        return answer;
    }
}