package Integer;

import java.util.Scanner;

public class Integer3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter file size in bytes: ");
        int Bytes= input.nextInt();
        int Kbytes=Bytes/1024;
        System.out.println("File size in Kbytes is "+Kbytes);
    }
}
