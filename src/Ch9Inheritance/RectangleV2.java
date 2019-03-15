package Ch9Inheritance;

public class RectangleV2 extends ShapeV2{
    private double width;
    private double length;

    public RectangleV2(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double area(){
        return width*length;
    }
    public double perimeter(){
        return 2*width + 2*length;
    }
}
