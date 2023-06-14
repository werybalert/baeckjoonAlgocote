class Solution {
    public String solution(String rny_string) {
        String[] answer = rny_string.split("");
        
        for (int i = 0; i < rny_string.length(); i++) {
            if (answer[i].equals("m")) {
                answer[i] = "rn";
            }
        }
        
        String join = String.join("", answer);
        return join;
    }
}
