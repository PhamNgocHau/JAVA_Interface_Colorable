import Geometric.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.howToColor();

        square = new Square(5.2);
        System.out.println("Side: " + square.getSide());

        square = new Square(8.8 , "RED" , true);
        System.out.println(square);
    }
}
