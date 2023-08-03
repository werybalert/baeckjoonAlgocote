class Solution {
    public long solution(String numbers) {
        String[] numAl = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i=0; i< numAl.length; i++) {
            numbers = numbers.replaceAll(numAl[i], String.valueOf(i));
        }
      return Long.parseLong(numbers);
    }
}