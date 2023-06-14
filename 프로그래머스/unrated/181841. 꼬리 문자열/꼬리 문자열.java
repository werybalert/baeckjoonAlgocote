    class Solution {
        public String solution(String[] str_list, String ex) {
            StringBuilder answer = new StringBuilder();
            
            for (String str : str_list) { //  각 요소에 대해 반복 작업을 수행, 해당 코드에서는 str_list 배열의 각 요소를 str이라는 변수에 할당하여 순회하고 있습니다. 즉, str_list 배열의 첫 번째 요소부터 마지막 요소까지 순차적으로 접근하면서 반복문의 블록 내에서 해당 요소를 활용
                if (!str.contains(ex)){
                    answer.append(str);
                }
            }
            return answer.toString();
        }
    }