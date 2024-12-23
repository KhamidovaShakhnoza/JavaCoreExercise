package OOP.Link2;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] coordinates = new int[2];
        coordinates[0] = this.x;
        coordinates[1] = this.y;
        return coordinates;
    }
    public void setXY(int x, int y){
    this.x = x;
    this.y = y;

    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
    public double distance(int px, int py) {
    return Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
    }
    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(another.getX() - x, 2) + Math.pow(another.getY() - y, 2));
    }
    public double distance(){
    return Math.sqrt(Math.pow(0-x, 2) + Math.pow(0-y, 2));
    }
}
