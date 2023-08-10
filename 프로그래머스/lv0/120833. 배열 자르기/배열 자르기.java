import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        List<Integer> arr = new ArrayList<>();

        for (int i = num1; i <= num2; i++) {
            arr.add(numbers[i]);
        }

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
