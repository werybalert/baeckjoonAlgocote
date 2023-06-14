class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0 ;i < n; i++) {
            answer += sb.charAt(i);
        }
        
        return answer;
    }
}