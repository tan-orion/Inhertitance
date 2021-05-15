package objectOfGeometry;



public class TestMain {
    public static void main(String[] args) {
        Shape shape= new Shape();
        System.out.println(shape);

        shape=new Shape("red",true);
        System.out.println(shape);

        Circle circle=new Circle();
        System.out.println(circle);

        circle =new Circle(5.2);
        System.out.println(circle);

        circle=new Circle(3.4,"blue",false);
        System.out.println(circle);

        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);

        rectangle =new Rectangle(3.4,53);
        System.out.println(rectangle);

        rectangle=new Rectangle(2.1,3.3 ,"orange",true);

        Square square= new Square();
        System.out.println(square);

        square= new Square(3);
        System.out.println(square);

        square=new Square(34,"yellow",true);
        System.out.println(square);
    }



}
