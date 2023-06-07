class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        int a = number %n;                
        int b = number %m;
        
        
            if (a == 0) {
                if (b == 0){
                    answer += 1;                
                } 
            } else 
                answer += 0;
   
                
        return answer;
    }
}