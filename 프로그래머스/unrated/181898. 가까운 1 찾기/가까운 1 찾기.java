class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
       int i = 0;
        
       while (i < arr.length){
           if (i >= idx){
               if (arr[i] == 1){
                   answer = i;
                   break;
               }
           }
           i++;
       }
        return answer;
    }
}
