class Club {
    // Attributes
    String name;
    int wins;
    int draws;
    int losses;
    // Methods 
    //1. Constructors
    public Club() {
        name = "";
        wins = 0;
        draws = 0;
        losses = 0;
    }
    // 
    public Club(String name, int wins, int draws, int losses) {
        this.name = name;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    }
    // 
    public Club(Club R) {
        this.name = R.name;
        this.wins = R.wins;
        this.draws = R.draws;
        this.losses = R.losses;
    }
    // Methods 
    public String getName() {
        return this.name;
    }
    public int getWins() {
        return this.wins;
    }
    public int getDraws() {
        return this.draws;
    }
    public int getLosses() {
        return this.losses;
    }
    // 
    public int numMatchesPlayed() {
        int numMatches = getWins() + getDraws() + getLosses();
        return numMatches;
    }
    // 
    public int getPoints() {
        int points = getWins()*3 + getDraws()*1 + getLosses()*0;
        return points;
    }
    // @Override toString()
    @Override 
    public String toString() {
        return "Club["+ name +", "+ wins +", "+ draws +", "+losses +", "+ getPoints() +"]";
    }
    // main driver 
    public static void main(String[] agrs) {
        // Create Club objects
        Club cb1 = new Club("sai gon", 1, 2, 0);
        // 
        System.out.println(cb1);
    }
}
// testing  
/*PS D:\demo\Lab5\ex2> javac Club.java
PS D:\demo\Lab5\ex2> java Club.java
Club[sai gon, 1, 2, 0, 5]
PS D:\demo\Lab5\ex2> 
 */