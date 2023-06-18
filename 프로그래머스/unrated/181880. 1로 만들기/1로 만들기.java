class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
    
        for (int i = 0; i < num_list.length; i++){
           int element = num_list[i]; 
        
        
        while(element != 1) {
            if (element %2 ==0) {
                element /= 2;
            }else {
                element -=1;
                element /=2;
            }
            answer++;
            }
        }
        return answer;
    }
}