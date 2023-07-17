import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int length = pat.length();
           
        for (int i = 0; i <= myString.length() - length; i++) {
            if (myString.substring(i, i + length).equals(pat)) {
                count++;
            } 
        }
        return count;
    }
}
