import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length);
        int[] result = new int[answer.length - 5];

        Arrays.sort(answer);

        for (int i = 0; i < result.length; i++) {
            result[i] = answer[i + 5];
        }

        return result;
    }
}
