class Solution {
    public int solution(int order) {
        int count =0;
        String numStr = Integer.toString(order);
        String[] or = numStr.split("");
        
        for (int i = 0; i < numStr.length(); i++) {
            if (or[i].equals("3") || or[i].equals("6") || or[i].equals("9")) {
                count++;
            } 
        }
        return count;
    }
}
