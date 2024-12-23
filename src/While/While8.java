package While;

import java.util.Scanner;

public class While8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter N (N>0):");
        int n= input.nextInt();
        int i=1;
        int quot=1;
        while(quot<=n){
            i++;
            quot=i*i;

        }int r=i-1;
        System.out.println(r);
    }
}
