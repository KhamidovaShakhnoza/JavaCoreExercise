package OOP.Link3.Ex2;

public class Test {
    public static void main(String[] args) {


        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        // Can also invoke with an array
        double[] coeffs = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial p3 = new MyPolynomial(coeffs);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println();
        System.out.println(p1.evaluate(1));
        System.out.println(p2.evaluate(1));
        System.out.println(p3.evaluate(1));

}
}