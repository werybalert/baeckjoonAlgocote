class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        String[] result = new String[answer.length];
        int index = 0;
        
        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].equals("")) {
                result[index] = answer[i];
                index++;
            }
        }

        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
        
        return finalResult;
    }
}
