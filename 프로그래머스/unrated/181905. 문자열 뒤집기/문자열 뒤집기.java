import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        if (s >= e) {
            return my_string;
        }
        
        char[] chars = my_string.toCharArray();
        
        while (s < e) {
            char temp = chars[s];
            chars[s] = chars[e];
            chars[e] = temp;
            
            s++;
            e--;
        }
        
        return new String(chars);
    }
}
