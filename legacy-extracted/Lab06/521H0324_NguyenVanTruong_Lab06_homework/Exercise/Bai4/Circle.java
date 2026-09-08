public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){
        this.radius = 1.0;
    }


    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double width){
        this.radius = width;
    }

    public double getArea(){
        return 3.1415 * this.radius * this.radius;
    }

    public double getPerimeter(){
        return 3.1415 * 2 * this.radius;
    }

    @Override
    public String toString(){
        return super.toString() + "Circle{" + "Radius=" + this.radius + "," + "Area=" + getArea() + "," + "Perimeter=" + getPerimeter() + "}";
    }

    
}