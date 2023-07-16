import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> result = new ArrayList<>();
        
        for (int i=0; i< my_string.length(); i+=m){ // m 글짜씩 반복
            String sub = my_string.substring(i,i+m); // sub에 0번부터 4번까지 넣기
            result.add(sub); // list 에 넣고
        }
        
        String answer = "";
        for (String str : result) { // list를 다 반복하는데
            answer += str.substring(c-1,c); // 각 문자열의 c번째 글자를 answer에 순차적으로 추가하는 역할
        }
        return answer;
    }
}