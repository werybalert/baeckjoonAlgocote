class Solution {
    public String solution(String myString) {
        
        StringBuilder result = new StringBuilder();
        String answer = myString.toLowerCase();
        String target = "a";
        
        for (int i=0; i < answer.length(); i++) {
            char ch = answer.charAt(i);
            if (String.valueOf(ch).equals(target)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}