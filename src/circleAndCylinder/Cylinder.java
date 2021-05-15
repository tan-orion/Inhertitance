package circleAndCylinder;

public class Cylinder extends Circle {
    private  double height;
    public Cylinder(){
    }
    public  Cylinder( double height,double radius,String color){
        super( radius, color);
        this.height=height;
    }
    public  double getHeight(){
        return  height;
    }
    public  void setHeight(double height){
        this.height=height;
    }

    public  double geVolume(){
        // V = π. r2. h
        return  height*getArea();
    }
    public String toString(){
        return "Cylinder with height of "
                +height
                +", which is a subclass of"
                +super.toString();
    }

}
