package test;

import chessPiece.King;
import chessPiece.Knight;
import chessPiece.Pawn;
import chessPiece.Rook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by paula on 06/04/18.
 */
public class PawnTest {

    Pawn pawn1, pawn2;
    Knight knight;
    King king;
    Rook rook;

    /**
     * Initialize all the variables
     */
    @Before
    public void initAll(){
        pawn1 = new Pawn(1);
        pawn2 = new Pawn(1);
        knight = new Knight(2);
        king = new King(1000);
        rook = new Rook(5);
    }

    /**
     * Test if a Pawn was promoted to a Knight
     */
    @Test
    public void promotionTest(){
        pawn1.promote(knight);
        Assert.assertTrue(pawn1.isHasBeenPromoted());
        Assert.assertNotEquals(knight, pawn1);
        Assert.assertEquals(knight, pawn1.getNewPiece());
    }

    /**
     * Test if a Pawn was not promoted to a King
     */
    @Test
    public void promotionToKingFailTest(){
        pawn2.promote(king);
        Assert.assertFalse(pawn2.isHasBeenPromoted());
        Assert.assertNull(pawn2.getNewPiece());
    }

    /**
     * Test if a Pawn was not promoted to a Pawn
     */
    @Test
    public void promotionToPawnFailTest(){
        pawn2.promote(pawn1);
        Assert.assertFalse(pawn2.isHasBeenPromoted());
        Assert.assertNull(pawn2.getNewPiece());
    }

    /**
     * Pawns that were promoted to different pieces are not equals
     */
    @Test
    public void pawnsPromotedToDifferentPiecesAreNotEqualTest(){
        pawn1 = new Pawn(1);
        pawn2 = new Pawn(1);

        pawn1.promote(knight);
        pawn2.promote(rook);

        Assert.assertTrue(pawn1.isHasBeenPromoted());
        Assert.assertTrue(pawn2.isHasBeenPromoted());

        Assert.assertNotEquals(knight, pawn1);
        Assert.assertNotEquals(rook, pawn2);

        Assert.assertEquals(knight, pawn1.getNewPiece());
        Assert.assertEquals(rook, pawn2.getNewPiece());

        Assert.assertNotEquals(pawn1, pawn2);
    }

    /**
     * Pawns that were promoted to the same pieces are equals
     */
    @Test
    public void pawnsPromotedToSamePiecesAreEqualTest(){
        pawn1 = new Pawn(1);
        pawn2 = new Pawn(1);

        pawn1.promote(knight);
        pawn2.promote(knight);

        Assert.assertTrue(pawn1.isHasBeenPromoted());
        Assert.assertTrue(pawn2.isHasBeenPromoted());

        Assert.assertNotEquals(knight, pawn1);
        Assert.assertNotEquals(knight, pawn2);

        Assert.assertEquals(knight, pawn1.getNewPiece());
        Assert.assertEquals(knight, pawn2.getNewPiece());

        Assert.assertEquals(pawn1, pawn2);
    }
}
