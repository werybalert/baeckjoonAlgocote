import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length]; // 정렬할 배열
        double[] order = new double [numlist.length]; // 순서를 번호로 기록할 배열
        
        for (int i=0; i< numlist.length; i++) { // 1차 for 문
            if (numlist[i] - n < 0) {// 정렬배열에서 비교 정수 뺸값이 음수면
                order[i] = ((int)Math.abs(numlist[i] -n)) + 0.5;} // 뒤로 가야하기에 +1
            else{
                order[i] = numlist[i] -n; // 그렇지 않다면 순서 배열에 뺄셈 계산으로 기록
            }}
        
        Arrays.sort(order); // 순서 정렬 = util.*
        
        for (int i=0; i< numlist.length; i++) { // 2차 for 문
            if (order[i] %1 != 0)  answer[i] = n - (int)order[i]; // 정렬할 배열에 비교수에서 뺄셈을 계산하면 원 값이 나온다! ex)  4-1 = 3이 나온 1차 계산 값에서 다시 비교 정수를 뺸다면 원값 출력
            else answer[i] = (int)order[i] + n; // 뒤로 빠질 음수 값은 비교 정수와의 합으로 원 값 출력 가능!
        }
        return answer;
    }
}