import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int count =0; // 중복 됨을 확인
        String[] result = s.split(""); // 분할하여 String 배열에 대입
        Arrays.sort(result); // 정렬!
        
        
        for (int i=0; i<result.length; i++) { // 1차 반복
            count =0; // 중복됨을 감지하기 위한 초기값
            for (int j=0; j<result.length; j++) { // 2차 반복
                if (result[i].equals(result[j])) { // 반복 감지
                    count ++; // 중복됨을 확인
                }
            }
            if (count ==1) { // 중복을 확인
                answer += result[i]; // 빈 String에 중복되지 않는 값을 넣고
            }
        }
        
        return answer; // 출력!
    }
}