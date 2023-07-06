import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        List<String> resultList = new ArrayList<>();
        int start = 0;
        int end = 0;

        while (end < myStr.length()) {
            if (myStr.charAt(end) == 'a' || myStr.charAt(end) == 'b' || myStr.charAt(end) == 'c') {
                if (start != end) {
                    String substring = myStr.substring(start, end);
                    resultList.add(substring);
                }
                start = end + 1;
            }
            end++;
        }

        if (start != end) {
            String substring = myStr.substring(start, end);
            resultList.add(substring);
        }

        if (resultList.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return resultList.toArray(new String[0]);
        }
    }
}
