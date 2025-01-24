package BookOOP.Ch10.Ex22.String;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();


        long startTime = System.currentTimeMillis();
        int count=0;
        for (int i = 0; i < text.length(); i++) {
            char c=text.charAt(i);
            if (c=='.'||c==','||c=='!'||c=='?')count++;
        }
        char[] resultArray = new char[count];
        for (int i = 0, j=0; i < text.length(); i++) {
            char c=text.charAt(i);
            if (c=='.'||c==','||c=='!'||c=='?')resultArray[j++]=c;
        }
        String result=new String(resultArray);
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println(result);
        System.out.println(result.length());

    }
}
