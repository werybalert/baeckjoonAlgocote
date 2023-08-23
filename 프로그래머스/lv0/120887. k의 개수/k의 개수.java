class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int l = i; l<= j; l++) {
            String count = Integer.toString(l); // count에 j까지 순서대로 String으로 생성
            
            for (int m = 0; m< count.length(); m++) {
                if (Integer.toString(k).equals(count.substring(m,m+1))) { // 만약 count의 배열 범위에서 k와 같은 수가 있다면!
                    answer++; // answer를 증가시킨다
                }
            }
        }
        return answer;
    }
}