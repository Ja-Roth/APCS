package Ch9Inheritance;

public class shapeClientV2 {
    public static void main(String[] args){
        ShapeV1[] shapes = {new Circle(5),
                new Rectangle(8,11),
                new Triangle(3,4,5)};
        //should print the area and perimeter of all the shapes
        shapeInfo(shapes);
    }
    public static void shapeInfo(ShapeV1[] shapes){
        /*
        for (int i = 0;i<shapes.length;i++){
            System.out.println("Area: " + shapes[i].area());
            System.out.println("Perimeter: " + shapes[i].perimeter() +"\n");

        }
        */
        // datatype var: shapes
        for(ShapeV1 client : shapes ){
            System.out.println("Area: " + client.area());
            System.out.println("Perimeter: " + client.perimeter() +"\n");
        }
    }
}
