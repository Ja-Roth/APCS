//shape is an interface that contains two methods
//area and perimiter. any class that implements shape
//is responsible for implementing all the methods of shape
package Ch9Inheritance;

public abstract class ShapeV2 implements Comparable {
    public abstract double area();
    public abstract double perimeter();
    public abstract String getName();

    public int compareTo(Object o){
        if(o instanceof ShapeV2){
            ShapeV2 s = (ShapeV2)o;
            if(this.area() > s.area()){
                return 1;
            }
            if(this.area() < s.area()){
                return -1;
            } else{
                return 0;
            }
        }
        return Integer.MIN_VALUE;
    }
}
