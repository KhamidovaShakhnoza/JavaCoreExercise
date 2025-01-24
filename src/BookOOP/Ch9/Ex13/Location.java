package BookOOP.Ch9.Ex13;

public class Location {
    public int row;
    public int column;
    public double maxValue;
    public static Location locateLargest(double[][] a){
        double max=-Double.MAX_VALUE;
        int maxI=0,maxJ=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]>max){
                    max=a[i][j];
                    maxI=i;
                    maxJ=j;
                }

            }

        }
        Location location=new Location();
        location.maxValue=max;
        location.row=maxI;
        location.column=maxJ;
        return location;
    }
}
