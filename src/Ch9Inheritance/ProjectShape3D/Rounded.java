package Ch9Inheritance.ProjectShape3D;

public abstract class Rounded implements Shape3D {
    //state fields
    private double radius;
    private double circleComp=Math.PI*Math.pow(radius,2);
    private double height;

    //
    public Rounded(double radius) {
        this.radius = radius;
    }

    public Rounded(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getCircleComp() {
        return circleComp;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}
