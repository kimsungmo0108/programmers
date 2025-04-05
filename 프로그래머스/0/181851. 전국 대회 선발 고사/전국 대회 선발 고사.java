class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int len = rank.length;
        int count = 0;
        int current = 0;
        
        for(int i=1; i<=len; i++){
            for(int j=0; j<len; j++){
                if(rank[j] == i){
                    if(attendance[j] == true){
                        if(count == 0){
                            answer += 10000 * j;
                            count++;
                        }else if(count == 1){
                            answer += 100 * j;
                            count++;
                        }else if(count == 2){
                            answer += j;
                            count++;
                        }
                    }
                }
            }
            if(count == 3){
                break;
            }
        }

        return answer;
    }
}