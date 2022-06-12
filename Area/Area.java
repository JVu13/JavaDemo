package Java_Demo.Area;

public class Area {
    private double length;
    private double width;

    public Area() {
        this(1.0,1.0);
    }
    
    public Area(double length, double width){
        this.length = length;
        this.width = width;

    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    
}
