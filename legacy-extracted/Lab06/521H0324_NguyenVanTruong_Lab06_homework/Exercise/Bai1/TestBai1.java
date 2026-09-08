public class TestBai1{
    public static void main(String [] args){
        Circle circle1 = new Circle();
        Circle circle = new Circle(3.5, "blue");

        System.out.println(circle);

        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(3.5);
        Cylinder cylinder = new Cylinder(3.5, 5);

        System.out.println(cylinder);
    }
}