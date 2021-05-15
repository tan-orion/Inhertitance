package point2dAndPoint3d;

public class Point3D extends Point2D{
    private  float z =0.0f;
    public Point3D(){

    }
    public  Point3D(float x,float y, float z){
        super(x,y);
        this.z=z;

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public  float[] getXYZ(){
        return new float[]{getZ(),getX(),getY()};
    }
    public  void setXYZ(float x, float y ,float z){
        setXY(x, y);
        setZ(z);
    }
    public String toString(){
        return "A point 3D with "
                +getY()
                +"and"
                +getX()
                +"and"
                +getX();
    }
}
