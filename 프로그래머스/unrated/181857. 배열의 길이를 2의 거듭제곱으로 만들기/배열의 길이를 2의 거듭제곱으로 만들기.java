import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length1 = arr.length;
        while (length1 == 0) {
            length1 = length1/2;
        }
        if (length1 ==1){
            return arr;
        }
        double x = 0;
        int y = 0;
        
        int length2 = arr.length;
        
        while(length2 > x){
            x = Math.pow(2,y++); // 첫 번째 인수를 밑(base)으로 하고, 두 번째 인수를 지수(exponent)로 하는 거듭제곱 값을 계산
        }
        
        int[] answer = new int [(int) x];
        for (int i=0; i< arr.length; i++) {
                answer[i] = arr[i];
            }
        return answer;
    }
}