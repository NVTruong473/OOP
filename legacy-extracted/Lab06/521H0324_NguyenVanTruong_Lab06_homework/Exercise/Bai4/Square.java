public class Square extends Rectangle{
    private double side = 1.0;

    public Square(){
        this.side = 1.0;
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);

    }

    public double getSide(){
        return this.side;
    }

    public void setSide(double side){
        this.side = side;
    }

    @Override
    public void setWidth(double width){
        this.side = width;
    }

    @Override
    public void setLength(double length){
        this.side = length;
    }

    @Override
    public String toString(){
        return super.toString() + "Square{" + "Side= "  + "Area= " +getArea() + "," + "Perimeter= " + getPerimeter() + "}";
    }
}