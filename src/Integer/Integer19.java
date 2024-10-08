package Integer;

import java.util.Scanner;

public class Integer19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter how many seconds passed from beginning of the day: ");
        int seconds= input.nextInt();
        int minutes=seconds/60;
        System.out.println(minutes+" minutes passed");

    }
}
