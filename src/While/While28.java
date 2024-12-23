package While;

import java.util.Scanner;

public class While28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter e (e>0):");
        double e = input.nextDouble();
        double A0=0;
        double A1=2;
        double s;
        double r=0;
        int k=2;
        double m;
        while (r<e){
            s=2+1/A1;
            A0=A1;
            A1=s;
            m=A1-A0;
            r=Math.abs(m);
            k++;
        }
        System.out.println("|A(k)-A(k-1)| = "+r+"; k = "+k+"; A(k-1) = "+A0+"; A(k) = "+A1);
    }
}
