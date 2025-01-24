package BookOOP.Ch10.Ex3;

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(29);

            // Test instance methods
            System.out.println("Value: " + myInt.getValue());
            System.out.println("Is Even: " + myInt.isEven());
            System.out.println("Is Odd: " + myInt.isOdd());
            System.out.println("Is Prime: " + myInt.isPrime());

            // Test static methods
            System.out.println("Static Is Even (10): " + MyInteger.isEven(10));
            System.out.println("Static Is Odd (10): " + MyInteger.isOdd(10));
            System.out.println("Static Is Prime (10): " + MyInteger.isPrime(10));

            // Test equals methods
            System.out.println("Equals 29: " + myInt.equals(29));
            System.out.println("Equals MyInteger(29): " + myInt.equals(new MyInteger(29)));

            // Test parseInt methods
            System.out.println("Parse char[] {'1', '2', '3'}: " + MyInteger.parseInt(new char[]{'1', '2', '3'}));
            System.out.println("Parse String \"456\": " + MyInteger.parseInt("456"));
        }
    }


