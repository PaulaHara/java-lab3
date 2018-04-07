package chessPiece;

/**
 * @author paulahara
 */
public class Pawn extends ChessPiece {

    private boolean hasBeenPromoted;
    private ChessPiece newPiece;

    /**
     * value = 1
     * @param value
     */
    public Pawn(int value) {
        super(value);
    }

    /**
     * @param hasBeenPromoted
     */
    public void setHasBeenPromoted(boolean hasBeenPromoted) {
        this.hasBeenPromoted = hasBeenPromoted;
    }

    /**
     * @return hasBeenPromoted
     */
    public boolean isHasBeenPromoted() {
        return hasBeenPromoted;
    }

    /**
     * @param newPiece
     */
    public void setNewPiece(ChessPiece newPiece) {
        this.newPiece = newPiece;
    }

    /**
     * @return newPiece
     */
    public ChessPiece getNewPiece() {
        return newPiece;
    }

    /**
     * Print how the piece move
     */
    @Override
    public void move() {
        System.out.println("forward 1");
    }

    /**
     * Promote a Pawn piece to newPiece that was passed as parameter
     * @param newPiece
     */
    public void promote(ChessPiece newPiece){
        King king = new King(1000);

        if(this.equals(newPiece) || newPiece.equals(king)){
            this.setHasBeenPromoted(false);
        }else{
            this.setHasBeenPromoted(true);
            this.setNewPiece(newPiece);
        }
    }

    /**
     * @param o
     * @return true if it's equals, false if not
     */
    @Override
    public boolean equals(Object o) {
        if(o != null) {
            if(o == this){
                return true;
            }
            if(!(o instanceof Pawn)){
                return false;
            }

            Pawn piece = (Pawn) o;

            if(this.newPiece != null) {
                return this.getValue() == piece.getValue()
                        && this.hasBeenPromoted == piece.hasBeenPromoted
                        && this.newPiece.equals(piece.getNewPiece());
            }

            return this.getValue() == piece.getValue()
                    && this.hasBeenPromoted == piece.hasBeenPromoted;
        }

        return false;
    }

    /**
     * @return hashCode
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.getValue();
        result = prime * result + (this.getNewPiece() != null ? this.getNewPiece().hashCode() : 0);
        return result;
    }

    /**
     * @return description about this piece
     */
    @Override
    public String toString() {
        Knight knight = new Knight(2);
        Bishop bishop = new Bishop(3);
        Rook rook = new Rook(5);
        Queen queen = new Queen(9);
        String promoted = "";

        if(isHasBeenPromoted() && getNewPiece() != null){
            promoted += ", new piece: ";
            if(this.getNewPiece().equals(knight)) {
                promoted += "knight";
            }else if(this.getNewPiece().equals(bishop)) {
                promoted += "bishop";
            }else if(this.getNewPiece().equals(rook)) {
                promoted += "rook";
            }else if(this.getNewPiece().equals(queen)) {
                promoted += "queen";
            }
        }

        return "Pawn [move: forward 1, promoted: "+isHasBeenPromoted()+""+promoted+"]";
    }
}
