class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n>0) {
            int d = n%10;
            answer += d;
            n /= 10;
        }
        
        return answer;
    }
}