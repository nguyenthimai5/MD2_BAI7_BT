package BT2;

public class Square implements IColorable {

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
public double getAreaSquare(){
        return Math.pow(side,2);
}
    @Override
    public String howToColor() {
        return "Color all four sides..." ;
    }
    public String toString(){
        return "AreaSquare: "+getAreaSquare()+howToColor();
    }
}
