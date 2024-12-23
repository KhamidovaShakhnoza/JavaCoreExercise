package BookOOP;

public class LinearEquation {
    private double a, b, c,d,e,f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public  boolean isSolvable() {
        if(a*d-b*c!=0)return true;
        return false;
    }

    public double getX() {
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY() {
        return (a*f-e*c)/(a*d-b*c);
    }

    public String printInfo(){
        String result;
        if (isSolvable())result="The Equation has 2 roots, x=: "
                +getX()+"; y=: "+getY();
        else result="The Equation has no solution.";
        return result;
    }
}
