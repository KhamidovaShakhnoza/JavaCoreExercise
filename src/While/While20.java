package While;

import java.util.Scanner;

public class While20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter N (N>0):");
        int n= input.nextInt();
        int num=0;
        int m=0;
        while(n>0){
            num=n%10;
            if (num==2) {
                m=1;
            }
            n=n/10;
        }
        if (m==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
