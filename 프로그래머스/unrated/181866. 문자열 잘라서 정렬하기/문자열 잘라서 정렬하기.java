import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] result1 = myString.split("x");
        
        Arrays.sort(result1);
        
        List<String>  result2 = new ArrayList<>();
        
         for (String str : result1) {
            if (!str.isEmpty()) {
                result2.add(str);
            }
        }
        
        String[] result3 = result2.toArray(new String[0]);
        Arrays.sort(result3);
        
        return result3;
    }
}
