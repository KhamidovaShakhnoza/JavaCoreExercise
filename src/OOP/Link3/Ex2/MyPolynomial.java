package OOP.Link3.Ex2;

import java.util.Arrays;
import java.util.Map;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return coeffs.length-1;
    }

    @Override
    public String toString() {
        StringBuilder sb =new StringBuilder();
        for (int i = coeffs.length-1; i >0; i--) {
            sb.append(coeffs[i]).append("x^").append(i).append("+");
        }
        sb.append(coeffs[0]);
        return sb.toString();
    }
    public  double evaluate(double x) {
        double sum = 0;
        for (int i =coeffs.length-1; i>=0 ; i--) {
            sum += coeffs[i]*(Math.pow(x,i));
        }
        return sum;

    }
    public MyPolynomial add(MyPolynomial right) {
         return null;
    }
    public MyPolynomial multiply(MyPolynomial right) {
        return null;

    }
}
