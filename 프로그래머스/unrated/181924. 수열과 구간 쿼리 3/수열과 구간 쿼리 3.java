class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] answer : queries) {
            int i = answer[0];
            int j = answer[1];
            
            int tr = arr[i];
            arr[i] = arr[j];
            arr[j] = tr;
        }
        return arr;
    }
}