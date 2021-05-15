package pointAndMoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed=0.0f;
    private  float ySpeed=0.0f;
    public MoveablePoint(){

    }
    public  MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public float[]getSpeed(){
        return new float[]{getxSpeed(),getySpeed()};
    }
    public String toString(){
        return "A MoveablePoint with"
                +"speed"
                +getySpeed()
                +","
                +getySpeed()
                +","
                +super.toString();
    }
    public MoveablePoint move() {
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
