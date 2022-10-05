package BT1;


public class Shape implements IResizeable {
private boolean fillted;
private String color;

    public Shape() {
    }

    public Shape(boolean fillted, String color) {
        this.fillted = fillted;
        this.color = color;
    }

    public boolean isFillted() {
        return fillted;
    }

    public void setFillted(boolean fillted) {
        this.fillted = fillted;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
public  String toString(){
        return "Fillted : "+isFillted()
                +"-----Color : "+getColor();
}

    @Override
    public double resize(double percent) {

        return percent;
    }
}
