import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isZeroFiveNumber(i)) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    private boolean isZeroFiveNumber(int num) {
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '0' && ch != '5') {
                return false;
            }
        }
        return true;
    }
}
