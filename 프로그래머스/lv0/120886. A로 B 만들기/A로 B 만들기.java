import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
    
        char[] bef = before.toCharArray();
        char[] aft = after.toCharArray();
        
        Arrays.sort(bef);
        Arrays.sort(aft);
        
        String b = new String (bef);
        String s = new String(aft);
        
        if (b.equals(s)){
            return 1;            
        } else {
                        return 0;

        }            
    }
}