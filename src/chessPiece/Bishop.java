package chessPiece;

/**
 * Created by paula on 04/04/18.
 */
public class Bishop extends ChessPiece {

    /**
     * value = 3
     * @param value
     */
    public Bishop(int value) {
        super(value);
    }

    /**
     * Print how the piece move
     */
    @Override
    public void move() {
        System.out.println("diagonally");
    }

    /**
     * @return description about this piece
     */
    @Override
    public String toString() {
        return "Bishop [move: diagonally]";
    }
}
