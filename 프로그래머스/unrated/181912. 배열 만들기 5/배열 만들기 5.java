import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i< intStrs.length; i++) {
            int target = Integer.parseInt(intStrs[i].substring(s,s+l));
            if (k < target) 
                list.add(target); // List를 쓴 이유
        }
        
        int[] result = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    
    }
}