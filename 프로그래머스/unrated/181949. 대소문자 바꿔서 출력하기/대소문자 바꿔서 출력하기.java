import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String s = "";
        
        
        for (int i=0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isUpperCase(c)) {
                s += Character.toLowerCase(c);
            } else {
                s += Character.toUpperCase(c);
            }
        }
         System.out.print(s);
    }
}