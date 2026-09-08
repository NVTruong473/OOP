public class TestBai4{
    public static void main(String [] args){
        Shape shape1 = new Shape();
        Shape shape = new Shape("blue", true);
        System.out.println(shape);


        Circle circle1 = new Circle();
        Circle circle = new Circle(3.5, "white", false);
        System.out.println(circle);


        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(6, 7);
        Rectangle rectangle = new Rectangle(5, 5, "black", true);
        System.out.println(rectangle2);
        System.out.println(rectangle);


        Square square1 = new Square();
        Square square2 = new Square(5);
        Square square = new Square(5, "yellow", true);
        System.out.println(square2);
        System.out.println(square);








    }
}