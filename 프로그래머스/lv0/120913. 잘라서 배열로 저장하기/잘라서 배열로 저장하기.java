import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList();
        for (int i = 0; i < (my_str.length() / n); i++) {
            answer.add(my_str.substring((n * i), (n * (i + 1))));// 0~5, 6~12 , 그외
        }
        if (my_str.length() % n != 0) { // 길이가 6의 배수가 아니면
             answer.add(my_str.substring( (my_str.length() / n) * n));  //원본 문자열을 그대로 반환
        }
        return answer.toArray(new String[0]); // 0번째 인덱스에는 answer 리스트의 첫 번째 요소가 저장
    }
}