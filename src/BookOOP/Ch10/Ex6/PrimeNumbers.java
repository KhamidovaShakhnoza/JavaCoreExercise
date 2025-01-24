package BookOOP.Ch10.Ex6;

public class PrimeNumbers {
    public static void main(String[] args) {
        StackOfIntegers prime = new StackOfIntegers();
        for (int i = 1; i <=120 ; i++) {
            prime.push(i);
        }
        for (int i = 0; i < 120; i++) {
            System.out.print(prime.pop()+" ");
        }
    }
}
