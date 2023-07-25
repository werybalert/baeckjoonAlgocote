class Solution {
    public int solution(int num, int k) {
        String num1 = Integer.toString(num);
        String num2 = Integer.toString(k);
        
        if (num1.indexOf(num2) == -1) {
            return -1;
        } else {
            return num1.indexOf(num2) +1; // 인덱스는 0부터 시작하므로 실제 위치를 나타내려면 1을 더해주어야 합니다.


        }
    }
}