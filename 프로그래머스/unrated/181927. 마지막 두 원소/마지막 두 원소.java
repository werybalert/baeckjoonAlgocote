class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int[] a = new int[num_list.length + 1];
        
        if (num_list[num_list.length -1] > num_list[num_list.length -2]) {
            System.arraycopy(num_list,0, a, 0, num_list.length); // 배열간 복사
            a[num_list.length ] = num_list[num_list.length -1] - num_list[num_list.length -2];
         }
            else {
                 System.arraycopy(num_list,0, a, 0, num_list.length); // 배열간 복사
            a[num_list.length ] = num_list[num_list.length -1] * 2;
            } 
                answer = a;
                return answer;
        }
    }
