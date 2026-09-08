class RegularPolygon
{
	private String name;
	private int edge, length;
	public RegularPolygon()
	{
		name = "";
		edge = 3;
		length = 1;
	}
	public RegularPolygon(String name, int edge, int length)
	{
		this.name = name;
		this.edge = edge;
		this.length = length;
	}
	public RegularPolygon(String name, int edge)
	{
		this.name = name;
		this.edge = edge;
		this.length = 1;
	}
	public RegularPolygon (RegularPolygon r)
	{
		this.name = r.name;
		this.edge = r.edge;
		this.length = r.length;
	}
	public String getName()
	{
		return name;
	}
	public int getEdge()
	{
		return edge;
	}
	public int getLength()
	{
		return length;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEdge(int edge)
	{
		this.edge = edge;
	}
	public void setLength(int length)
	{
		this.length = length;
	}
	public String getPolygon()
	{
		if (edge == 3)
			return "Triangle";
		else if (edge ==4)
			return "Quadrangle";
		else if (edge == 5)
			return "Pentagon";
		else if (edge == 6)
			return "Hexagon";
		else
			return "Polygon has the number of edges greater than 6";
	}
	public double getPerimeter()
	{
		return edge * length;
	}
	public double getArea()
	{
		double a = 0;
		if(edge == 3)
			a = 0.433;
		else if (edge == 4)
			a = 1;
		else if (edge == 5)
			a=1.72;
		else if (edge == 6)
			a = 2.595;
		return length * length * a;
	}
	public String toString()
	{
		return name + "-" + getPolygon() + "-"+ getArea();
	}
	
}