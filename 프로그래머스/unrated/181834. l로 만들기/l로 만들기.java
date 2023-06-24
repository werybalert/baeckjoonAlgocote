class Solution {
    public String solution(String myString) {
        char[] answer = myString.toCharArray();    
        
          for (int i=0; i< answer.length; i++) {
                if (answer[i]< 'l'){
                    answer[i] = 'l';
                 }
             }

        
        return new String(answer);
    }
}