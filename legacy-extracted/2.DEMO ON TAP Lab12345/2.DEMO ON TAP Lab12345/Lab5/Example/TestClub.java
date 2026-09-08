class TestClub
{
	public static void main(String[] arg)
	{
		Club c1 = new Club();
		System.out.println(c1.toString());
		Club c2 = new Club("MU", 5, 3, 2);
		System.out.println(c2.toString());
		Club c3 = new Club(c2);
		System.out.println(c3.toString());
		c1.setName("Real Marid");
		System.out.println(c1.toString());
	}
}