package While;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N: ");
        int N= input.nextInt();
        System.out.print("Enter K: ");
        int K= input.nextInt();
        int count=0;
        while(N>=K){
            N-=K;
            count++;
        }
        System.out.println("Bo'linma = "+count+"; qoldiq= "+N);
    }
}
