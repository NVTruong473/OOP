class Rectangle
{
	private float width = 0.0f;
	private float height = 0.0f;
	public Rectangle()
	{
		width = 1;
		height = 1;
	}
	public Rectangle(float w, float h)
	{
		width = w;
		height = h;
	}
	public float getWidth()
	{
		return width;
	}
	public float getHeight()
	{
		return height;
	}
	public void setWidth(float w)
	{
		width = w;
	}
	public void setHeight(float h)
	{
		height = h;
	}
	public String toString()
	{
		String s = "Rectangle[width=" + width + ", height=" + height + "]";
		return s;
	}
}
