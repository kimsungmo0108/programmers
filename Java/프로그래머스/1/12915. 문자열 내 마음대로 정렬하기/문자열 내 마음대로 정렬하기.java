class Solution {
    public String[] solution(String[] strings, int n) {
        int len = strings.length;
        String temp;
        
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                char c1 = strings[j].charAt(n);
                char c2 = strings[j + 1].charAt(n);
                
                if (c1 > c2 || (c1 == c2 && strings[j].compareTo(strings[j + 1]) > 0)) {
                    temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        
        return strings;
    }
}
