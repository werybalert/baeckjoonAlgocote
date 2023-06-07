class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        int di = num % n;
        
        if (di == 0)
            answer += 1;
        else 
            return answer;
        
        return answer;
    }
}