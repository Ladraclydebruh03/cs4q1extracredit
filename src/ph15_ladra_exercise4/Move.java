package ph15_ladra_exercise4;
public class Move {
    private final String name;
    private Move strongAgainst;
    
    public Move(String name){
        this.name = name;
        this.strongAgainst = null;
    }
	public String getName(){
		return this.name;
	}
	public Move getStrongAgainst(){
		return this.strongAgainst;
	}
	public void setStrongAgainst(Move strongAgainst){
		this.strongAgainst = strongAgainst;
	}
public static int compareMoves(Move m1, Move m2) {
    // This method returns 0 if m1 wins, 1 if m2 wins, and 2 if it's a tie

    if (m1.getStrongAgainst() == m2) {
        return 0; // m1 wins
    } 
    else if (m2.getStrongAgainst() == m1){
        return 1; // m2 wins
    } else {
        return 2; // It's a tie
    }
}

}