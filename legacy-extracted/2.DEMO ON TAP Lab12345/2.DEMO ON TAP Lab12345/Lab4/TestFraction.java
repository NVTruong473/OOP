class TestFraction
{
	public static void main(String[] arg)
	{
		Fraction f1 = new Fraction();
		System.out.println(f1.toString());
		Fraction f2 = new Fraction(3, 4);
		System.out.println(f2.toString());
		Fraction f3 = f1.add(f2);
		System.out.println(f3.toString());
	}
}