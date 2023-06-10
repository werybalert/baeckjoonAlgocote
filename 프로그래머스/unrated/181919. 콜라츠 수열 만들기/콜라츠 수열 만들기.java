class Solution {
    public int[] solution(int n) {
        int[] answer = new int[500];
        int count = 0;
        
        while (n != 1) {
            answer[count] = n;
            count++;
            
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        
        answer[count] = 1;
        
        int[] collatzSequence = new int[count + 1];
        for (int i = 0; i <= count; i++) {
            collatzSequence[i] = answer[i];
        }
        
        return collatzSequence;
    }
}
