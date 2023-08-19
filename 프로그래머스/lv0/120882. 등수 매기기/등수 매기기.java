class Solution {
    public int[] solution(int[][] score) {
        
        double[] avg = new double[score.length]; // 평균
        int[] answer = new int[score.length]; //

        for(int i=0; i<score.length; i++) {  // 1차 for문으로 평균 배열 생성
            avg[i] = (double)(score[i][0] + score[i][1]) / 2; 
        }

        for(int i=0; i<avg.length; i++) { // 2차 for문으로 순위 생성
            int rank = 1; // 0등은 존재 x = 초기값 생성
            for(int j=0; j<avg.length; j++) { // 3차 for문은 차 for문과 비교하기 위해 생성
                if(avg[i] < avg[j]) { // 비교값이 크다면
                    rank++; // 순위 하락
                }
            }
            answer[i] = rank; // 순위값을 출력할 answer 에 저장
        }
        return answer;
    }
}
