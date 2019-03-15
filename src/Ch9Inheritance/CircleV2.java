//cicle implements the shape class, therfore it is
//circles responsibility tp implement area and perimeter
package Ch9Inheritance;

public class CircleV2 extends ShapeV2 {
    private double radius;

    public CircleV2(double radius) {
        this.radius = radius;
    }
    //area
    public double area(){
        return Math.PI * Math.pow(radius,2);
    }
    //perimeter
    public double perimeter(){
        return 2* Math.PI *radius;

    }
}
