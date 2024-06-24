class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int max = a>b ? a:b;
        int min = a<b ? a:b;
        if(a%2==1 && b%2==1){
            answer = (a*a) + (b*b);
        }else if(a%2==1 || b%2==1){
            answer = 2 * (a+b);
        }else{
            answer = max - min;
        }
        return answer;
    }
}