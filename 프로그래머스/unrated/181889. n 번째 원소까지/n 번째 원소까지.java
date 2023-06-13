import java.util.Arrays;


class Solution {
    public int[] solution(int[] num_list, int n) {

        int[] answer = Arrays.copyOfRange(num_list, 0, n);

        return answer;
    }
}

// 만약 num_list 배열의 첫 n개의 요소를 answer 배열로 복사하고 싶다면, Arrays.copyOfRange() 메서드를 사용할 수 있습니다. 이 메서드를 사용하면 배열의 특정 범위만큼을 새로운 배열로 복사할 수 있습니다.