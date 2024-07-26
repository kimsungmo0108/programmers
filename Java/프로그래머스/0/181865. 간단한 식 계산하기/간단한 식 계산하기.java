class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String a = "";
        String b = "";
        char op = ' ';
        int index = -1;
        
        for (int i = 0; i < binomial.length(); i++) {
            char ch = binomial.charAt(i);
            if (ch >= '0' && ch <= '9') {
                a += ch;
            } else if (ch == ' ') {
                continue;
            } else {
                op = ch;
                index = i;
                break;
            }
        }

        for (int i = index + 1; i < binomial.length(); i++) {
            char ch = binomial.charAt(i);
            if (ch >= '0' && ch <= '9') {
                b += ch;
            }
        }

        int a1 = Integer.valueOf(a);
        int b1 = Integer.valueOf(b);
        
        if (op == '+') {
            answer = a1 + b1;
        } else if (op == '-') {
            answer = a1 - b1;
        } else if (op == '*') {
            answer = a1 * b1;
        }
        
        return answer;
    }
}
