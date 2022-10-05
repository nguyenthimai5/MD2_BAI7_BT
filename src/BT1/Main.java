package BT1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        Circle circle=new Circle();
       double radius= circle.resize(Math.random()*100);
         circle=new Circle(true,"red",radius);
        circle.getAreaCircle();
        shapes[0]=circle;


        Rectangle rectangle=new Rectangle();
        double width= rectangle.resize(Math.random()*100);
        double lenght= rectangle.resize(Math.random()*100);
        rectangle=new Rectangle(true,"blue",width,lenght);
        rectangle.getAreaRectangle();
        shapes[1]=rectangle;

        Square square=new Square();
        double side= square.resize(Math.random()*100);
        square=new Square(false,"yellow",side);
        square.getAreaSquare();
        shapes[2]=square;

        System.out.println(shapes.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
    }
}
