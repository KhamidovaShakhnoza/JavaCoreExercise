package String;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter string: ");
        String a= input.nextLine();
        System.out.println(a);
        char [] chars=a.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char temp=chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=temp;
        }
        String result=new String(chars);
        System.out.println(result);
    }
}
