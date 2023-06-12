class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        StringBuilder sb = new StringBuilder(my_string);
        int a = my_string.length();
        
        for (int i = a - n; i < a; i++){
            answer += sb.charAt(i);
        }
        
        return answer;
    }
}

/*

         StringBuilder sb = new StringBuilder(my_string);
        
        String revers = sb.reverse().toString();
        
         answer = revers.substring(0, n);

        입력값 〉	"ProgrammerS123", 11
기댓값 〉	"grammerS123"
실행 결과 〉	실행한 결괏값 "321Sremmarg"이 기댓값 "grammerS123"과 다릅니다.
테스트 2
입력값 〉	"He110W0r1d", 5
기댓값 〉	"W0r1d"
실행 결과 〉	실행한 결괏값 "d1r0W"이 기댓값 "W0r1d"과 다릅니다.
*/