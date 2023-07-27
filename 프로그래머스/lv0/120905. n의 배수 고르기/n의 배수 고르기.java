import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> hi = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                hi.add(numlist[i]);
            }
        }

        // Convert List<Integer> to int[]
        int[] result = new int[hi.size()];
        for (int i = 0; i < hi.size(); i++) {
            result[i] = hi.get(i);
        }

        return result;
    }
}
