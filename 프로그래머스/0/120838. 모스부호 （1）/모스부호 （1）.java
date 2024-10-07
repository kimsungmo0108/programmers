class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morseList = letter.split(" ");

        for (String morse : morseList) {
            if (morse.equals(".-")) {
                answer += "a";
            } else if (morse.equals("-...")) {
                answer += "b";
            } else if (morse.equals("-.-.")) {
                answer += "c";
            } else if (morse.equals("-..")) {
                answer += "d";
            } else if (morse.equals(".")) {
                answer += "e";
            } else if (morse.equals("..-.")) {
                answer += "f";
            } else if (morse.equals("--.")) {
                answer += "g";
            } else if (morse.equals("....")) {
                answer += "h";
            } else if (morse.equals("..")) {
                answer += "i";
            } else if (morse.equals(".---")) {
                answer += "j";
            } else if (morse.equals("-.-")) {
                answer += "k";
            } else if (morse.equals(".-..")) {
                answer += "l";
            } else if (morse.equals("--")) {
                answer += "m";
            } else if (morse.equals("-.")) {
                answer += "n";
            } else if (morse.equals("---")) {
                answer += "o";
            } else if (morse.equals(".--.")) {
                answer += "p";
            } else if (morse.equals("--.-")) {
                answer += "q";
            } else if (morse.equals(".-.")) {
                answer += "r";
            } else if (morse.equals("...")) {
                answer += "s";
            } else if (morse.equals("-")) {
                answer += "t";
            } else if (morse.equals("..-")) {
                answer += "u";
            } else if (morse.equals("...-")) {
                answer += "v";
            } else if (morse.equals(".--")) {
                answer += "w";
            } else if (morse.equals("-..-")) {
                answer += "x";
            } else if (morse.equals("-.--")) {
                answer += "y";
            } else if (morse.equals("--..")) {
                answer += "z";
            }
        }

        return answer;
    }
}
