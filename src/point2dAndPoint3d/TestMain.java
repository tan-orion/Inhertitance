package point2dAndPoint3d;

public class TestMain {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(10,20);
        point2D.setXY(30,30);
        System.out.println(point2D);
        Point3D point3D = new Point3D(5,6,7);
        System.out.println(point3D);
    }
}
