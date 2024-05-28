import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)>='A' && a.charAt(i)<='Z'){
                str += String.valueOf((char)(a.charAt(i)-'A'+'a'));
            }else if(a.charAt(i)>='a' && a.charAt(i)<='z'){
                str += String.valueOf((char)(a.charAt(i)-'a'+'A'));
            }
        }
        System.out.println(str);
    }
}