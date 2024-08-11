class Solution {
    public String solution(int[] numLog) {
                StringBuilder commands = new StringBuilder();
        
        for (int i = 1; i < numLog.length; i++) {
            int difference = numLog[i] - numLog[i-1];
            
            if (difference == 1) {
                commands.append('w');
            } else if (difference == -1) {
                commands.append('s');
            } else if (difference == 10) {
                commands.append('d');
            } else if (difference == -10) {
                commands.append('a');
            }
        }
        
        return commands.toString();
    }
}