import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> factors = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
             // i가 n의 소인수인 경우, factors 리스트에 추가하고 n을 i로 나눕니다.

            while (n % i == 0) {
                if (!factors.contains(i)) { // 중복을 제거해야함
                    factors.add(i);
                }
                n /= i;
            }
        }
        
        int[] answer = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            answer[i] = factors.get(i);
        }
        
        return answer;
    }
}

