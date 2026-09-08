public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){
        super();
    }

    public Cylinder(double radius){
        this.radius =radius;
    }

    public Cylinder(double radius, double height){
        this.radius =radius;
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return getArea() * this.height;
    }

    @Override
    public String toString(){
        return "Cylinder {" + "Radius=" + radius + "Color=" + color + "Height=" + height + "Volume=" + getVolume() + "}";
    }
}