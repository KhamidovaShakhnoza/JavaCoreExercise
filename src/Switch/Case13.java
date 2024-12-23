package Switch;

import java.util.Scanner;

public class Case13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number and value (1:a,2:c,3:h,4:s):");
        int num= input.nextInt();
        char value = input.next().charAt(0);
        switch (num){
            case(1):
                double c=Math.sqrt(2)*value;
                double h=c/2;
                double s=value*value/2;
                System.out.println("Leg is "+value+"; hypotenuse is "+c+"; h is "+h+"; area is "+s);
                break;
            case(2):
                double a=value/Math.sqrt(2);
                 h=a/Math.sqrt(2);
                 s=a*a/2;
                System.out.println("Leg is "+a+"; hypotenuse is "+value+"; h is "+h+"; area is "+s);
                break;
            case(3):
                 a=Math.sqrt(2)*value;
                 c=2*value;
                 s=a*a/2;
                System.out.println("Leg is "+a+"; hypotenuse is "+c+"; h is "+value+"; area is "+s);
                break;
            case(4):
                 a=Math.sqrt((2*value));
                 h=a/Math.sqrt(2);
                 c=2*a*Math.sqrt(value);
                 System.out.println("Leg is "+a+"; hypotenuse is "+c+"; h is "+h+"; area is "+value);
                break;
            default:
                System.out.println("No such number");
                break;
        }
          }
    }

