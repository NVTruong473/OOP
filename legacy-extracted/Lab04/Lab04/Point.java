public class Point{
    // 1. A class called Point is designed as shown in the following class diagram. It contains:
    // • Two private instance variables: x (of the type float) and y (of the type float), with default 0.0
    // and 0.0, respectively.
    // • Two overloaded constructors: a default constructor with no argument, and a constructor that
    // takes 2 float arguments for the x coordinate and y coordinate.
    // Two public methods: getX() and getY(), which return the x coordinate and the y coordinate
    // of this instance, respectively.


    // Point2D
    private float x = 0.0f;
    private float y = 0.0f;


    public Point2D(){
        this.x = 0.0f;
        this.y= 0.0f;
    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }
}