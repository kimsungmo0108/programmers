class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int constant = 0;

        String[] terms = polynomial.split(" \\+ ");

        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    x += 1;
                } else {
                    x += Integer.parseInt(term.substring(0, term.length()-1));
                }
            } else {
                constant += Integer.parseInt(term);
            }
        }

        if(x != 0){
            answer += x == 1 ? "x" : x + "x";
        }
        
        if (constant != 0) {
            if (x != 0) {
                answer += " + ";
            }
            answer += constant;
        }

        return answer;
    }
}
