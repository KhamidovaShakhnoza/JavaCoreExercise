package For;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("How much is 1 kg candy? (in sum) ");
        double cost= input.nextDouble();
        for(double i =0.1;i<=1;i+=0.1){
            double newcost=i*cost;
            System.out.println(i+" kg candy is "+newcost+" sum");

        }
    }
}
