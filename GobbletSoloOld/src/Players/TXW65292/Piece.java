package Players.TXW65292;

public class Piece {
	
	public int player_id, piece_size;
	
	/**
	 * Constructs a new GamePiece
	 * 
	 * @param id the playerid of the piece
	 * @param size the size of the piece
	 */
	public Piece(int id, int size) {
		this.player_id = id;
		this.piece_size = size;
	}
	
	@Override
	public boolean equals(Object other){
	    if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof Piece)) return false;
	    Piece p = (Piece) other;
	    if(p.player_id != this.player_id || p.piece_size != this.piece_size)
	    	return false;
	    return true;
	}
	
}
