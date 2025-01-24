package BookOOP.Ch10.Ex22.String;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();
        String result="";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < text.length(); i++) {
            char c=text.charAt(i);
            if (c=='.'||c==','||c=='!'||c=='?')result+=c;


        }
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println(result);
        System.out.println(result.length());

    }
}
