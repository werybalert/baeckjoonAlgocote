import java.util.Arrays;
class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[100000];
        for(int i = 0 ; i < strArr.length; i++) {
            count[strArr[i].length()]++;
        }
        return Arrays.stream(count).max().getAsInt();
// count 배열의 요소 중에서 최댓값을 찾아 반환
    }
}
