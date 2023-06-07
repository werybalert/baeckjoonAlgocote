class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int result = (2 * a) * b;
        int answer1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));             int answer2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
  
        if (answer1 > result)
            answer += answer1;
        else 
            answer += result;
        
        return answer;
    }
}