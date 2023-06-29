class Solution {
    public int[] solution(String myString) {
          String[] arr = myString.split("x", -1); //-1 :  제한 없이 모든 패턴에 대해 분할을 수행한다는 것을 의미
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }
        return answer;

    }
}