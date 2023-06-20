class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        String[] alp = code.split("");
            
        for (int i=0; i < code.length(); i++) {
            if (i %q == r) {
                answer.append(alp[i]);
            } 
        }
        return answer.toString();
    }
}