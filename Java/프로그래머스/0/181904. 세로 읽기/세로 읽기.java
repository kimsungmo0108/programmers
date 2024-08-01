class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder result = new StringBuilder();
        int length = my_string.length();

        // c는 1-based index이므로 0-based index로 변환
        int colIndex = c - 1;

        for (int i = colIndex; i < length; i += m) {
            result.append(my_string.charAt(i));
        }

        return result.toString();
    }
}
