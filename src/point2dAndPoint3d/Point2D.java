package point2dAndPoint3d;

public class Point2D {
    private float x=0.0f;
    private  float y =0.0f;
     public Point2D(){

    }
    public  Point2D(float x,float y){
         this.x=x;
         this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public  float getY(){
         return y;
    }
    public  void setXY(float x,float y){
         this.x=x;
         this.y=y;
    }
    public float[]getXY(){
         return new float[]{x,y};
    }
    public String  toString(){
         return "A point with x"
                 +x
                 +"and"
                 +y;
    }
}
