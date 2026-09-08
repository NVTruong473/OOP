public class Rectangle{
    // Rectangle
    private float width = 1.0f;
    private float length = 1.0f;
    
    public Rectangle(){
        this.width = 1.0f;
        this.length = 1.0f;
    }
    
    public Rectangle(float width, float length){
        this.width = width;
        this.length = length;
    }
    
    public float getWidth(){
        return this.width;
    }
    
    public float getLength(){
        return this.length;
    }
    
    public float getArea(){
        return this.width * this.length;
    }
    
    public float getPerimeter(){
        return 2 * (this.width +this.length);
    }
    
    
    public void setWidth(float width){
        this.width = width;
    }
    
    public void setLength(float length){
        this.length = length;
    }
    
    public String toString(){
        return "Rectangle [" + width +"," + length + "]";
    }
}