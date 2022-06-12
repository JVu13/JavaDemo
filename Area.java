package Java_Demo;

public class Area {
    float length;
    float width;

    public Area() {

    }
    
    void setDim(float length, float width) {
        this.length = length;
        this.width = width;
    }

    float getArea() {
        return length * width;
    }
}
