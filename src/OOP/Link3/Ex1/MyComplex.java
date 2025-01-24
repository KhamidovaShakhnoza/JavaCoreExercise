package OOP.Link3.Ex1;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this(0.0, 0.0);
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "("+real+"+"+imag+"i)";
    }
    public boolean isReal(){
        return real==0.0;
    }
    public boolean isImaginary(){
        return imag==0.0;
    }
    public boolean equals(double real, double imag){
        return imag==real;
    }
    public boolean equals(MyComplex another){
        return real==another.getReal() && imag==another.getImag();
    }
    public  double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }
    public MyComplex addInto(MyComplex right){
        return new MyComplex(real+right.real, imag+right.imag);
    }
    public MyComplex addNew(MyComplex right){
        return new MyComplex(real+right.real, imag+right.imag);
    }
}
