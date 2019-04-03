package Ch9Inheritance.ProjectShape3D;

public class Cone extends Rounded {


    public Cone(double radius, double height) {
        super(radius, height);
    }

    @Override
    public double getArea() {
        double parenthesis = getRadius() + Math.sqrt(Math.pow(getHeight(),2)+Math.pow(getRadius(),2));
        return (getCircleComp()/getRadius())*parenthesis;
    }

    @Override
    public double getVolume() {
        return getHeight()/3 *getCircleComp();
    }
}
