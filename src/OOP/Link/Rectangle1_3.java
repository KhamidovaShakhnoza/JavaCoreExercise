package OOP.Link;

public class Rectangle1_3 {
    private float length;
    private float width;
    public Rectangle1_3(){
        length=1.0f;
        width=1.0f;
    }
    public Rectangle1_3(float length, float width){
        this.length=length;
        this.width=width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle1_3{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
