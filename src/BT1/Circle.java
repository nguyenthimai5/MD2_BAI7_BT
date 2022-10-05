package BT1;

import java.util.Scanner;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(boolean fillted, String color, double radius) {
        super(fillted, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getAreaCircle(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public String toString(){
        return "Circle: "+ super.toString()+"-----Radius: "+getRadius()+"-----AreaCircle: "+getAreaCircle();
    }
}
