class Club
{
	private String name;
	private int wins, draws, losses;
	public Club()
	{
		name = "";
		wins =draws=losses=0;
	}
	public Club(String name, int wins, int draws, int losses)
	{
		this.name = name;
		this.wins = wins; 
		this.draws = draws;
		this.losses = losses;
	}
	public Club (Club cl)
	{
		this.name = cl.name;
		this.wins = cl.wins;
		this.draws = cl.draws;
		this.losses= cl.losses;
	}
	public String getName()
	{
		return name;
	}
	public int getWins()
	{
		return wins;
	}
	public int getDraws()
	{
		return draws;
	}
	public int getLosses()
	{
		return losses;
	}
	public void setName(String n)
	{
		this.name = n;
	}
	public void setWins(int wins)
	{
		this.wins = wins;
	}
	public void setDraws(int draws)
	{
		this.draws = draws;
	}
	public void setLosses(int losses)
	{
		this.losses = losses;
	}
	public int getMatches()
	{
		return wins + draws + losses;
	}
	public boolean isFinished()
	{
		if (getMatches() >= 10)
			return true;
		return false;
	}
	public int getPoints()
	{
		return wins * 3 + draws*1;
	}
	public String toString()
	{
		return name + ": " + wins + "/" + draws + "/" + losses;
	}
	
}