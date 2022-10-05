package BT2;

public class Main {
    public static void main(String[] args) {
        Square[] squares=new Square[1];
        Square square=new Square(3.3);
      squares[0]=square;
        System.out.println("AreaSquare: "+square.getAreaSquare()+"\n"+square.howToColor());
    }
}
