package chessPiece;

/**
 * @author paulahara
 *
 */
public class Queen extends ChessPiece {

    /**
     * value = 9
     * @param value
     */
    public Queen(int value) {
        super(value);
    }

    /**
     * Print how the piece move
     */
    @Override
    public void move() {
        System.out.println("like a bishop or a rook");
    }

    /**
     * @return description about this piece
     */
    @Override
    public String toString() {
        return "Queen [move: like a bishop or a rook]";
    }
}
