package Ch9Inheritance;


public class shapeClientV2 {
    public static void main(String[] args){
        ShapeV2[] shapes = {new CircleV2(5,"Circle"),
                new RectangleV2(8,11,"Rectangle"),
                new TriangleV2(3,4,5,"Triangle")};
        //should print the area and perimeter of all the shapes
        shapeInfo(shapes);
        int answer=shapes[0].compareTo(shapes[1]);
        if (answer>0){
            System.out.println("Circle has the larger area");
        } else if (answer<0){
            System.out.println("Rectangle has the larger area");
        } else {
            System.out.println("They have the same area");
        }
    }
    public static void shapeInfo(ShapeV2[] shapes){

        // datatype var: shapes
        for(ShapeV2 client : shapes ){
            System.out.println("Name of Shape: " + client.getName());
            System.out.println("Area: " + client.area());
            System.out.println("Perimeter: " + client.perimeter() +"\n");
        }
    }
}
