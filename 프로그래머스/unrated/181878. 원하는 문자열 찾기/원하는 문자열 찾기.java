    class Solution {
        public int solution(String myString, String pat) {
            int a = myString.length();
            int b = pat.length();
            String[] sp = myString.split("");
            myString = myString.toLowerCase();
            pat = pat.toLowerCase();

            if (a <b){
                return 0;
            }

            for (int i = 0; i <= a - b; i++) {
        if (myString.substring(i, i + b).equals(pat)) {
            return 1;
        }
    }
           return 0;
        }
    }