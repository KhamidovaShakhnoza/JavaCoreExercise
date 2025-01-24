package MyBigNum;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigNumber {
    private int[]digits;
//    public BigNumber add(BigNumber anotherNumber) {
//        for (int i = 0; i < anotherNumber.digits.length; i++) {
//
//        }
//    }
public static void main(String[] args) {


//BigInteger a = new BigInteger("9223372036854775807");
//    BigInteger b = new BigInteger("2");
//    BigInteger c = a.multiply(b); // 9223372036854775807 * 2
//System.out.println(c);
    BigDecimal a = new BigDecimal("1.0");
    BigDecimal b = new BigDecimal("3");
    BigDecimal c = a.divide(b, 20, RoundingMode.HALF_UP);
    System.out.println(c);
}
}