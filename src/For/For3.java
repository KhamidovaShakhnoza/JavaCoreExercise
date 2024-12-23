package For;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b (a<b):");
        int a = input.nextInt();
        int b = input.nextInt();
        int count=0;
        for(int i=b-1;i>a;i--){
            System.out.println(i);
            count++;
        }
        System.out.println("Count is "+count);
    }
}
