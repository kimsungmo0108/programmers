import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        String target = String.join("", spell);
        char[] targetArray = target.toCharArray();
        Arrays.sort(targetArray);
        String sortedTarget = new String(targetArray);

        for (String word : dic) {
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = new String(wordArray);

            if (sortedTarget.equals(sortedWord)) {
                return 1;
            }
        }

        return 2;
    }
}
