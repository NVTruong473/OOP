class Student
{
	private int id;
	private String FN, LN;
	public Student (int id, String fn, String ln)
	{
		this.id = id;
		this.FN = fn;
		this.LN = ln;
	}
	public int getID()
	{
		return id;
	}
	public String getFN()
	{ 
		return FN;
	}
	public String getLN()
	{
		return LN;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	public void setFN(String fn)
	{
		this.FN = fn;
	}
	public void setLN (String ln)
	{
		this.LN = ln;
	}
	public String getName()
	{
		return FN + " " + LN;
	}
	public String toString()
	{
		String s = "Student[id="+id + ", Firstname=" + FN + ", Lastname= " + LN + "]";
		return s;
	}
}