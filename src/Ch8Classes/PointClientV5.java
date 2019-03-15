package Ch8Classes;

public class PointClientV5 {
    public static void main(String[] args) {
        //instantiate a point object called p1
        PointV5 p1 = new PointV5(3,6);
        PointV5 p2 = new PointV5(3,6);

        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);

        System.out.println(PointV4.getObjcount());
        System.out.println(p1.equals(p2));



    }
}
