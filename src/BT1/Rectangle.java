package BT1;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double width;
    private double lenght;

    public Rectangle() {
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(boolean fillted, String color, double width, double lenght) {
        super(fillted, color);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getAreaRectangle() {
        return this.width * this.lenght;
    }
    public String toString(){
        return "Rectangle: "+ super.toString()+"-----lenght: "+getLenght()+"-----Width "+getWidth()+"-----AreaRectangle: "+getAreaRectangle();
    }
}
