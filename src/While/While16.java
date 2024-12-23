package While;

import java.util.Scanner;

public class While16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter P (0<P<50):");
        int p= input.nextInt();
        int allWay=10;
        int percent;
        while (allWay<=14){
            percent=(allWay/100)*p;
            allWay+=percent;
        }
        System.out.println(allWay);
    }
}
