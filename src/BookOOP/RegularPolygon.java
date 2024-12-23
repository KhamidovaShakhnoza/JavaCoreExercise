package BookOOP;

public class RegularPolygon {
    private  int n;
    private double side;
    private double x;
    private double y;
    RegularPolygon(){
        n=3;
        side=1;
        x=0;
        y=0;
    }
    RegularPolygon(int n,double side){
        this.n=n;
        this.side=side;
        x=0;
        y=0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    double getPerimeter(){
        return n*side;
    }
    double getArea(){
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }

    @Override
    public String toString() {
        return "RegularPolygon{" +
                "n=" + n +
                ", side=" + side +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    public String printInfo(){
        return "Perimeter is: "+getPerimeter()+", Area is: "+getArea();
    }
}
