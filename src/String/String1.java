package String;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter character: ");
        char a= input.nextLine().charAt(0);
        System.out.println((int)a);
    }
}
