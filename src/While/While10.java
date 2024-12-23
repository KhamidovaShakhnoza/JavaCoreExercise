package While;

import java.util.Scanner;

public class While10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter N (N>1):");
        int n= input.nextInt();
        int k=0;
        int quot=3;
        while(quot<=n){
            quot*=3;
            k++;
        }
        System.out.println(k);
    }
}
