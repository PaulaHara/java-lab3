package chessPiece;

/**
 * @author paulahara
 */
public class Knight extends ChessPiece {

    /**
     * value = 2
     * @param value
     */
    public Knight(int value) {
        super(value);
    }

    /**
     * Print how the piece move
     */
    @Override
    public void move() {
        System.out.println("like an L");
    }

    /**
     * @return description about this piece
     */
    @Override
    public String toString() {
        return "Knight [move: like an L]";
    }
}
