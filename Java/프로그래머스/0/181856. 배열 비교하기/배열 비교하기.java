class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        int sum1 = 0;
        int sum2 = 0;
        if(len1 > len2){
            answer = 1;
        }else if(len1 < len2){
            answer = -1;
        }else if(len1 == len2){
            for(int i=0; i<len1; i++){
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            if(sum1 > sum2){
                answer = 1;
            }else if(sum1 < sum2){
                answer = -1;
            }else if(sum1 == sum2){
                answer = 0;
            }
        }
        return answer;
    }
}