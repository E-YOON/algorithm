/*
 * 0 이상의 두 정수가 문자열 a, b로 주어질 때, 
 * a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
 */

import java.math.BigInteger;

public class 두수의합2 {
    public String solution(String a, String b) {
        BigInteger aInt = new BigInteger(a);
        BigInteger bInt = new BigInteger(b);
        return String.valueOf(aInt.add(bInt));
    }
}
