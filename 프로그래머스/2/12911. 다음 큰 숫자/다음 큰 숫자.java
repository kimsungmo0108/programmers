class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int ones = countOnes(n);
        for(int i=n; true;){
            i++;
            if(ones == countOnes(i)){
                return i;
            }
        }
    }
    public int countOnes(int n){
        int m = n;
        int ones = 0;
        for(;m>0;){
            if(m%2 == 1){
                ones++;
            }
            m /= 2;
        }
        return ones;
    }
}