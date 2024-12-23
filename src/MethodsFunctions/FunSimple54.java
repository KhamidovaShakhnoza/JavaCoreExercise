package MethodsFunctions;

import java.util.Scanner;

public class FunSimple54 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Day, Month,Year:  ");
        int D= input.nextInt();
        int M= input.nextInt();
        int Y= input.nextInt();
    }
    public static String PrevDate(int D, int M, int Y){
        if (D==1 && M==1){
            D=31;M=12;Y-=1;
        }else{
        switch (M) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                switch (D / 31) {
                    case 0:
                        D++;
                        break;
                    case 1:
                        D = 1;
                        M++;
                        break;
                }
            case 2:
                switch (D / 28) {
                    case 0:
                        D++;
                        break;
                    case 1:
                        D = 1;
                        M = 3;
                        break;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                switch (D / 30) {
                    case 0:
                        D++;
                        break;
                    case 1:
                        D = 1;
                        M++;
                        break;
                }
            case 12:
                switch (D / 31) {
                    case 0:
                        D++;
                        break;
                    case 1:
                        D = 1;
                        M = 1;
                        break;
                }


        }}
        return "D = "+D+" M= "+M+" Y= "+Y;
    }
}
