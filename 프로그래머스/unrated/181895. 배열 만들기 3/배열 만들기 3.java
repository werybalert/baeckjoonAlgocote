import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int length = 0;
        
        for (int i=0; i< intervals.length; i++) {
            int[] group = intervals[i];
            length += group[1] - group[0] +1 ;// 0부터 시작하기에 +1 해주면 길이 구하기 
        }
        
        int[] answer = new int [length];
        
        int index = 0;
        for (int i=0; i< intervals.length; i++) { 
            int[] group = intervals[i];
            for(int j=group[0]; j<= group[1]; j++ ){
               answer[index++] = arr[j]; 
            }
        }
        
             return answer;
    }
}