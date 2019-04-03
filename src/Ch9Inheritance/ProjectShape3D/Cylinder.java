package Ch9Inheritance.ProjectShape3D;

public abstract class Cylinder extends Rounded {


    public Cylinder(double radius, double height, double height1, double radius1) {
        super(radius, height);

    }

    @Override

    public double getArea() {
        return  (2*(getCircleComp()/getRadius()) *getHeight()) + 2*getCircleComp();
    }

    @Override
    public double getVolume() {
        return getCircleComp()*getHeight();
    }


}
