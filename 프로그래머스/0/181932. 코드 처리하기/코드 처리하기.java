class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (ch == '1') {
                mode = 1 - mode;
            } else {
                if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)) {
                    ret += ch;
                }
            }
        }

        return ret.equals("") ? "EMPTY" : ret;
    }
}
