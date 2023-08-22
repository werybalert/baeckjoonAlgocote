import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Integer[] num_objects = new Integer[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            num_objects[i] = num_list[i];
        }
        
        List<Integer> list = new ArrayList<>(Arrays.asList(num_objects));
        Collections.reverse(list);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
