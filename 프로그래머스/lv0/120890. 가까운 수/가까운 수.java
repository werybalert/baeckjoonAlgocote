import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
         int answer = 0;
        List<Integer> a = new ArrayList<>();
        Arrays.sort(array);
        for (int i=0; i<array.length; i++) {
            a.add(Math.abs(array[i]-n)); // 3, 2, 1
        }
        int min = a.get(0); // 3
        int idx = 0;
        
        for (int i=1; i<a.size(); i++) {// 두번만 반복 
            if (a.get(i)<min) { // 2 < 3 | 1 < 2
                min = a.get(i); // 2  | 2
                idx = i; // 1 | 
            }
        } 
        answer = array[idx];
        return answer;
    }
}