class Solution {
    public int solution(int n) {
        int count = 0;
        
        for (int i=1; i<= n;  i++) {
            int a=0;
            for (int j=1; j<=i; j++) {
                if (i%j==0) {
                a++;
                }
            }
            if ( a>=3) {
                count++;
            }
        }
        
        return count;
    }
}