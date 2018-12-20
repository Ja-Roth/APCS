//This class is a template to represent a point
//on the cartesian coordinate
package Ch8Classes;

public class PointV4 {
    //state fields below (Variables)
    private int x;
    private int y;
    //static fields reside at the class level Not the object level
    private static int objcount;
    //Constuctor
    public PointV4(int initialX, int initialY){
        objcount++;
        x = initialX;
        y =initialY;

    }
    public PointV4(){
        x =0;
        y =0;
    } public int getX(){
        return x;
    } public int getY(){
        return y;
    } public void setX(int x){
        this.x=x;
    } public void setY(int y){
        this.y=y;
    }

    //Behaviors below (Methods)
    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public void setLocation(int newX, int newY){
        x = newX;
        y = newY;

    }
    //Getter (accessor) method below
    public double distance(PointV4 other){
        int dx = x-other.x;
        int dy = y-other.y;
        double answer = Math.sqrt((dx*dx) + (dy * dy));
        return answer;
    }
    public double distanceOrigin(){
        double answer = Math.sqrt((x*x) + (y * y));
        return answer;

    }
    // we are over riding the objects built in toString() method
    //to print the contents
   public String toString(){

        return("(" + x +", " + y + ")");
    }
    public static int getObjcount(){
        return objcount;
    }
}
