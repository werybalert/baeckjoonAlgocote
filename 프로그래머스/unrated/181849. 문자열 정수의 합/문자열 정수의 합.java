class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int [] a = {};
        
        for (int i=0; i < num_str.length(); i++) {
            char ch = num_str.charAt(i);
            int num = Character.getNumericValue(ch); 
            answer += num;
        }
        
        return answer;
    }
}