import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
       List<String> unfinishedList = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) { // true
                unfinishedList.add(todo_list[i]);
            }
        }

        String[] unfinishedItems = unfinishedList.toArray(new String[unfinishedList.size()]);

        return unfinishedItems;
    }
}