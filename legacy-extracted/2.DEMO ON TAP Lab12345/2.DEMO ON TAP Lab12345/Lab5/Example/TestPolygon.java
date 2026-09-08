class TestPolygon
{
	public static void main(String[] arg)
	{
		RegularPolygon r1 = new RegularPolygon();
		System.out.println(r1.toString());
		RegularPolygon r2 = new RegularPolygon("aa", 3, 10);
		System.out.println(r2.toString());
		RegularPolygon r3 = new RegularPolygon("bb", 3);
		System.out.println(r3.toString());
		RegularPolygon r4 = new RegularPolygon(r3);
		System.out.println(r4.toString());
	}
}