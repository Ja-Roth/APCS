package Ch9Inheritance.ProjectShape3D;

public abstract class Sphere extends Rounded {


    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return 4*getCircleComp();
    }

    @Override
    public double getVolume() {
            return (4.0 / 3.0) * getCircleComp() * getRadius();
    }

}
