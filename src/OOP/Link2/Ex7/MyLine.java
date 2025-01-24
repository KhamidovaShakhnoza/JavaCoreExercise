package OOP.Link2.Ex7;

public class MyLine {
    private MyLinePoint begin;
    private MyLinePoint end;

    public MyLine(MyLinePoint begin, MyLinePoint end) {
        this.begin = begin;
        this.end = end;
    }
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyLinePoint(x1, y1);
        this.end = new MyLinePoint(x2, y2);
    }

    public MyLinePoint getBegin() {
        return begin;
    }

    public void setBegin(MyLinePoint begin) {
        this.begin = begin;
    }

    public MyLinePoint getEnd() {
        return end;
    }

    public void setEnd(MyLinePoint end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int beginY) {
        begin.setY(beginY);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int endX) {
        end.setX(endX);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int endY) {
        end.setY(endY);
    }
    public int[] getBeginXY(){
        int[] beginXY = new int[2];
        beginXY[0]=begin.getX();
        beginXY[1]=begin.getY();
        return beginXY;
    }
    public void setBeginXY(int x1, int y1){
        int[] beginXY=new int[2];
        beginXY[0]=x1;
        beginXY[1]=y1;
    }

    public int[] getEndXY(){
        return new int[]{end.getX(), end.getY()};
    }
    public void setEndXY(int x1, int y1){
        int[] endXY=new int[2];
        endXY[0]=x1;
        endXY[1]=y1;
    }

    @Override
    public String toString() {
        return "MyLine[" + "begin=" + begin + ", end=" + end + ']';
    }
}
