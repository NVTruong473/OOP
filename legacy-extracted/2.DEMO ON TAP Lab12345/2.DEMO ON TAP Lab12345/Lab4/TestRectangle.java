class TestRectangle
{
	public static void main(String[] arg)
	{
		Rectangle r1 = new Rectangle();
		System.out.println(r1.toString());
		Rectangle r2 = new Rectangle(20, 10);
		System.out.println(r2.toString());
		System.out.println(r2.getWidth());
		r2.setHeight(100);
		System.out.println(r2.getHeight());
	}
}