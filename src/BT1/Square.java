package BT1;

public class Square extends Shape {
    private double side;
    public Square() {
    }
    public Square(double side){
        this.side=side;
    }

    public Square(boolean fillted, String color, double side) {
        super(fillted, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getAreaSquare(){
        return Math.pow(this.side,2);
    }
    public String toString(){
        return  "Square: "+super.toString()+"-----Side: "+getSide()+"-----AreaSquare: "+getAreaSquare();
    }
}
