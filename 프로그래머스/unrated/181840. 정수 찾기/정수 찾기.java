class Solution {
    public int solution(int[] num_list, int n) {
        for (int num : num_list) {
            if (num == n) {
                return 1; // num_list 안에 n이 존재하면 1을 반환
            }
        }
        return 0; // num_list 안에 n이 존재하지 않으면 0을 반환
    }
}
