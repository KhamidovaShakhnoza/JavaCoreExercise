package While;

import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("2 sonining qandaydur darajasini bildiruvchi n sonini kiriting :");
        int n= input.nextInt();
        int count=0;
        while(n!=1){
            n=n/2;
            count++;
        }
        System.out.println("n=2^k; k="+count);
    }
}
