class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder result = new StringBuilder();
        boolean[] toRemove = new boolean[my_string.length()];

        // 삭제할 인덱스 표시
        for (int index : indices) {
            toRemove[index] = true;
        }

        // 문자열 순회하며 문자 추가
        for (int i = 0; i < my_string.length(); i++) {
            if (!toRemove[i]) {
                result.append(my_string.charAt(i));
            }
        }

        return result.toString();
    }
}
