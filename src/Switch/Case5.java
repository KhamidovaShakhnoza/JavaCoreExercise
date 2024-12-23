package Switch;

import java.util.Scanner;

public class Case5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N (1;4), A, B (B!=0):");
        int N = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();
        switch(N){
            case 1:
                double a=A+B;
                System.out.println("A+B="+a);
                break;
            case 2:
                double s=A-B;
                System.out.println("A-B="+s);
                break;
            case 3:
                double m=A*B;
                System.out.println("A*B="+m);
                break;
            case 4:
                double d=A/B;
                System.out.println("A/B="+d);
                break;
            default:
                System.out.println("No such operation");
        }
    }
}
