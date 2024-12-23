package Switch;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter K:");
        int K= input.nextInt();
        switch(K){
            case 1:
                System.out.println("bad");
                break;
            case 2:
                System.out.println("unsatisfactory");
                break;
            case 3:
                System.out.println("mediocre");
                break;
            case 4:
                System.out.println("good");
                break;
            case 5:
                System.out.println("excellent");
                break;
            default:
                System.out.println("error");

        }
    }
}
