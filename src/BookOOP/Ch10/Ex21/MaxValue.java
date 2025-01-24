package BookOOP.Ch10.Ex21;

import java.math.BigInteger;

public class MaxValue {
    public static void main(String[] args) {
        BigInteger start = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE); // Start from Long.MAX_VALUE + 1
        BigInteger five = BigInteger.valueOf(5);
        BigInteger six = BigInteger.valueOf(6);
        int count = 0; // To track how many numbers we've found

        while (count < 10) { // Find the first 10 numbers
            if (start.mod(five).equals(BigInteger.ZERO) || start.mod(six).equals(BigInteger.ZERO)) {
                System.out.println(start); // Print or store the result
                count++;
            }
            start = start.add(BigInteger.ONE); // Move to the next number
        }
    }
}
