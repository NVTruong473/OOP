class TestPoint2D
{
	public static void main(String[] arg)
	{
		Point2D p1 = new Point2D();
		System.out.println("x: " + p1.getX() + ", y: " + p1.getY());
		Point2D p2 = new Point2D(10, 5);
		System.out.println("x: " + p2.getX() + ", y: " + p2.getY());
	}
}