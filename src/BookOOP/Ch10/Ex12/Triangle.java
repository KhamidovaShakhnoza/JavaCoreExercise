package BookOOP.Ch10.Ex12;

public class Triangle {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    public Triangle(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
    public double getDistance(MyPoint m1, MyPoint m2) {
        return Math.sqrt(Math.pow((m2.getX()-m1.getX()), 2) + Math.pow((m2.getY()-m1.getY()), 2));
    }
    public double getArea(){
        double a=getDistance(p1,p2);
        double b=getDistance(p2,p3);
        double c=getDistance(p3,p1);
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }
    public double Area(MyPoint p1,MyPoint p2,MyPoint p3){
        double a=getDistance(p1,p2);
        double b=getDistance(p2,p3);
        double c=getDistance(p3,p1);
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }
    public double getPerimeter(){
        return (getDistance(p1, p2) + getDistance(p2, p3)+getDistance(p1, p3));
    }
    public boolean contains(MyPoint p){
        return Area(p1,p2,p3)==Area(p1,p2,p)+Area(p3,p2,p)+Area(p1,p3,p);
    }

    @Override
    public String toString() {
        return "Triangle[" + "p1=(" + p1.getX() + ","+p1.getY()+
                "); p2=(" + p2.getX() + ","+p2.getY()+
                "); p3=(" + p3.getX() +","+p3.getY()+ ")]";
    }
}
