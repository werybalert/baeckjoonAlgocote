class Solution {
    public int solution(int[] date1, int[] date2) {
        int[] n = new int[date1.length];
        int[] m = new int[date2.length];
        
        for (int i=0; i<date1.length; i++) {
            n[i] = date1[i];
            m[i] = date2[i];
            
            if (n[i] < m[i]){
                return 1;
            } else if (n[i] > m[i]) {
                return 0;
            }
        }
        return 0;
        
        
    }
}
