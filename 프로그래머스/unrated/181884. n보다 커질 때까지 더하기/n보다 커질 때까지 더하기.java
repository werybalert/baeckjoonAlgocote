// import java.util.Arrays;
// return Arrays.stream(numbers).reduce(0, (acc, i) -> n >= acc ? acc + i : acc);

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for (int i=0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) {
                break;
                }
           }
        
        return answer;
    }
}