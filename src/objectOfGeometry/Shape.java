package objectOfGeometry;

public class Shape {
    private String color="green";
    private  boolean filled= true;
    public Shape(){

    }
    public  Shape(String color,boolean filled){

    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
    public  String getColor(){
       return color;
    }

   public String toString(){
        return "A Shape with color of"
                +getColor()
                +"and"
                +(isFilled()?"filled":"not filled");
    }
}
