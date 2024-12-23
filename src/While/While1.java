package While;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter A and B (A>B):");
        int a= input.nextInt();
        int b=input.nextInt();
        int count=0;
        while(a>b){
            a-=b;
            count++;
        }
        System.out.println("Bo'linma:"+count);
        System.out.println("Reminder:"+a);
    }
}
