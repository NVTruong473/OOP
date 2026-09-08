class Fraction
{
	private int nu, de;
	public Fraction()
	{
		nu = de = 1;
	}
	public Fraction(int nu, int de)
	{
		this.nu = nu;
		this.de = de;
	}
	public Fraction (Fraction f)
	{
		this.nu = f.nu;
		this.de = f.de;
	}
	public Fraction add(Fraction f)
	{
		int nu1, de1;
		nu1 = this.nu * f.de + f.nu * this.de;
		de1 = this.de * f. de;
		Fraction res = new Fraction(nu1, de1);
		return res; //return new Fraction(nu1, de1);
	}
	public String toString()
	{
		String s= nu + "/" + de;
		return s;
	}
}