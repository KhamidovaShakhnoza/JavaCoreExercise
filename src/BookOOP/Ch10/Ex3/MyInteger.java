package BookOOP.Ch10.Ex3;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public boolean isEven(){
        return value % 2 == 0;
    }
    public boolean isOdd(){
        return value % 2 != 0;
    }
    public boolean isPrime(){
        if(value<2)return false;
        int temp=1;
        for (int i = 2; i <value-1 ; i++) {
            temp=value%i;
            if(temp==0)return false;
        }
        return true;
    }
    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    public static boolean isOdd(int value){
        return value % 2 != 0;
    }
    public static boolean isPrime(int value){
        if(value<2)return false;
        int temp=1;
        for (int i = 2; i <value-1 ; i++) {
            temp=value%i;
            if(temp==0)return false;
        }
        return true;
    }
    public static boolean isEven(MyInteger value){
        return value.isEven();
    }
    public static boolean isOdd(MyInteger value){
        return value.isOdd();
    }
    public static boolean isPrime(MyInteger value){
        return value.isPrime();
    }
    public boolean equals(int otherValue){
        return this.value == otherValue;
    }
    public boolean equals(MyInteger other){
        return this.value == other.getValue();
    }

    public static int parseInt(char[] chars) {
        int result = 0;
        for (char c : chars) {
            result = result * 10 + (c - '0');
        }
        return result;
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

}
