package While;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter positive A and B (A>B):");
        int A= input.nextInt();
        int B= input.nextInt();
        int count=0;
        while(A>B){
            A-=B;
            count++;
        }
        System.out.println("Bo'linma:"+count);
        System.out.println("Reminder:"+A);
    }
}
