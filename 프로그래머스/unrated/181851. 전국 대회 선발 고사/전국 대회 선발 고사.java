import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        
        for (int i=0; i< rank.length; i++) {
            map.put(rank[i],i);
        }
        for (int i=0; i< rank.length; i++) {
            if (attendance[i]){
                intlist.add(rank[i]);
            }
        }
        
        Collections.sort(intlist);
        
        int num1 = map.getOrDefault(intlist.get(0),0);
        int num2 = map.getOrDefault(intlist.get(1),0);
        int num3 = map.getOrDefault(intlist.get(2),0);
        
        int answer = num1 * 10000 + num2 * 100 + num3;
        return answer;
    }
}