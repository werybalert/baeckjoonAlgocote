class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a = "";
        String b = "";
        
        for (int i=0; i < num_list.length; i++) {
            if (num_list[i]%2 == 0) {
                 a += Integer.toString(num_list[i]);
            } else
                b += Integer.toString(num_list[i]);
        }
        int jjak = Integer.parseInt(a);
        int hhol = Integer.parseInt(b);
        
        int total = jjak + hhol;
        answer += total;
            
        return answer;
    }
}