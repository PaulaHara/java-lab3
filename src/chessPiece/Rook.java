package chessPiece;

/**
 * @author paulahara
 */
public class Rook extends ChessPiece {

    /**
     * value = 5
     * @param value
     */
    public Rook(int value) {
        super(value);
    }

    /**
     * Print how the piece move
     */
    @Override
    public void move() {
        System.out.println("horizontally or vertically");
    }

    /**
     * @return description about this piece
     */
    @Override
    public String toString() {
        return "Rook [move: horizontally or vertically]";
    }
}
