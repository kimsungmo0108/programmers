class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String menu : order){
            if(menu.contains("americano") || menu.contains("anything")){
                answer += 4500; 
            }else if(menu.contains("cafelatte")){
                answer += 5000;                
            }
        }
        return answer;
    }
}