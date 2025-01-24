package OOP.Link3.Ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter complex number 1 (real and imaginary part): ");
        double number1real = sc.nextDouble();
        double number1imag = sc.nextDouble();
        System.out.println("Enter complex number 2 (real and imaginary part): ");
        double number2real = sc.nextDouble();
        double number2imag = sc.nextDouble();
        System.out.println();

        MyComplex myComplex1=new MyComplex(number1real,number1imag);
        System.out.println("Number 1 is: "+myComplex1);

        if (myComplex1.isReal()) System.out.println(myComplex1+" is a pure real number");
        else System.out.println(myComplex1+" is Not a pure real number");
        if (myComplex1.isImaginary()) System.out.println(myComplex1+" is a pure imaginary number");
        else System.out.println(myComplex1+" is Not a pure imaginary number");
        System.out.println();

        MyComplex myComplex2=new MyComplex(number2real,number2imag);
        System.out.println("Number 2 is: "+myComplex2);
        if (myComplex2.isReal()) System.out.println(myComplex2+" is a pure real number");
        else System.out.println(myComplex2+" is Not a pure real number");
        if (myComplex2.isImaginary()) System.out.println(myComplex2+" is a pure imaginary number");
        else System.out.println(myComplex2+" is Not a pure imaginary number");
        System.out.println();

        if (myComplex1.equals(myComplex2)) System.out.println(myComplex1+" is equal to "+myComplex2);
        else System.out.println(myComplex1+" is Not equal to "+myComplex2);
        System.out.println(myComplex1+"+"+myComplex2+"="+myComplex1.addInto(myComplex2));


    }
}
