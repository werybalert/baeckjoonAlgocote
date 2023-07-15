import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a,b,c,d}; // 배열로 묶기
        
        Arrays.sort(dice); // 정렬로 내림차순 정리
        
        int answer = 0;
        
        if (dice[0] == dice[3]) { // 네 주사위에서 나온 숫자가 모두 같다
            answer = dice[0] * 1111;
        } else if (dice [0] == dice[2] || dice[1] == dice[3]) { //  주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)
            answer = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice [0] == dice[1] && dice[2] == dice[3]) { //  주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)
            answer = (dice[0] + dice[3]) * (dice[3] - dice[0]);
    // 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)
        } else if (dice[0] == dice[1]) { 
            answer = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            answer = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            answer = dice[0] * dice[1];
        } else {
            answer = dice[0]; //네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자
        }
        return answer;
    }
}