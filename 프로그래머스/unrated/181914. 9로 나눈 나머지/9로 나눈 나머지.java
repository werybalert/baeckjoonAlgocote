import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        int answer = 0;
        
       BigInteger num = new BigInteger(number);
        
       BigInteger remainder = num.remainder(BigInteger.valueOf(9));   
        return remainder.intValue();
    }
}

// 최종적으로 intValue() 메소드를 사용하여 BigInteger를 int 형식으로 변환하여 반환
// 입력된 문자열이 매우 큰 숫자를 나타내고 있을 경우, long 자료형의 범위를 초과할 수 있으므로 BigInteger 클래스를 사용하여 처리