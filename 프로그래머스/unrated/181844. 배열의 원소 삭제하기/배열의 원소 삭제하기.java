import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list1 = new ArrayList<>();
        for (int num : arr) {
            list1.add(num);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int num : delete_list) {
            list2.add(num);
        }

        list1.removeAll(list2);

        int[] result = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            result[i] = list1.get(i);
        }

        return result;
    }
}
