class Solution {
    public int solution(int[] common) {
        int answer = common[0];

        for (int i = 2; i <= common.length ; i++) {
            if (i == common.length) { // 배열의 마지막 원소
                if (common[i-1] - common[i-2] == common[i-2] - common[i-3]) {
                    // 등차 수열
                    answer = common[i-1] + (common[i-1] - common[i-2]);
                } else if (common[i-1] % common[i-2] == 0) {
                    // 등비 수열
                    answer = common[i-1] * (common[i-1] / common[i-2]);
                } else {
                    // 둘다 아닌 경우
                    answer = common[i-1];
                }
            }
        }

        return answer;
    }
}
