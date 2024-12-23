package BookOOP;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return b*b-4*a*c;
    }
    public double getRoot1() {
        if (getDiscriminant()>0) {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        }else {
            return 0;
        }
    }
    public double getRoot2() {
        if (getDiscriminant()>0) {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        }else {
            return 0;
        }
    }
    public String printInfo(){
        String result;
        if (getDiscriminant()>0)result="Quadratic Equation has 2 roots, 1: "
                +getRoot1()+"; 2: "+getRoot2();
        else if(getDiscriminant()==0)result="Quadratic Equation has 1 root: "+getRoot1();
        else result="Quadratic Equation has no roots.";
        return result;
    }
}
