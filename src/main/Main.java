package main;

import chessPiece.*;

/**
 * @author paulahara
 */
public class Main {

    public static void main(String[] args) {
        Pawn pawn = new Pawn(1);
        Knight knight = new Knight(2);
        Bishop bishop = new Bishop(3);
        Rook rook = new Rook(5);
        Queen queen = new Queen(9);
        King king = new King(1000);

        Pawn pawn2 = new Pawn(1);
        Knight knight2 = new Knight(2);
        Bishop bishop2 = new Bishop(3);
        Rook rook2 = new Rook(5);
        Queen queen2 = new Queen(9);
        King king2 = new King(1000);

        // ************** Equals **************
        System.out.println("Comparing same types of pieces: ");
        System.out.println("Pawn is equal to Pawn2: " + pawn.equals(pawn2));
        System.out.println("Knight is equal to Knight2: " + knight.equals(knight2));
        System.out.println("Bishop is equal to Bishop2: " + bishop.equals(bishop2));
        System.out.println("Rook is equal to Rook2: " + rook.equals(rook2));
        System.out.println("Queen is equal to Queen2: " + queen.equals(queen2));
        System.out.println("King is equal to King2: " + king.equals(king2));

        System.out.println("\nComparing different types of pieces: ");
        System.out.println("Pawn is equal to Knight: " + pawn.equals(knight));
        System.out.println("Bishop is equal to Rook: " + bishop.equals(rook));
        System.out.println("Queen is equal to King: " + queen.equals(king));

        // ************** Moves **************
        System.out.println("\nPrinting how the pieces move: ");
        System.out.print("Pawn move: ");
        pawn.move();

        System.out.print("Knight move: ");
        knight.move();

        System.out.print("Bishop move: ");
        bishop.move();

        System.out.print("Rook move: ");
        rook.move();

        System.out.print("Queen move: ");
        queen.move();

        System.out.print("King move: ");
        king.move();

        // ************** Pawn Promoted **************
        System.out.println("\nPromoting Pawn to Knight: ");
        Pawn pawnPromoted = new Pawn(1);
        Pawn pawnPromoted2 = new Pawn(1);
        pawnPromoted.promote(knight);
        pawnPromoted2.promote(knight2);
        System.out.println("Pawn was promoted: " + pawnPromoted.isHasBeenPromoted());
        System.out.println("Pawn is equal to Pawn Promoted: " + pawn.equals(pawnPromoted));
        System.out.println("Pawn Promoted is equal to Knight: " + pawnPromoted.equals(knight));
        System.out.println("Pawn Promoted (Knight) is equal to another Pawn Promoted (Knight): " + pawnPromoted.equals(pawnPromoted2));

        pawnPromoted2.promote(rook);
        System.out.println("Pawn Promoted (Knight) is equal to another Pawn Promoted (Rook): " + pawnPromoted.equals(pawnPromoted2));

        System.out.print("Pawn Promoted (Knight) move: ");
        pawnPromoted.move();

        System.out.print("Pawn Promoted (Knight - New Piece) move: ");
        pawnPromoted.getNewPiece().move();

        System.out.println("\nPromoting Pawn to Pawn: ");
        Pawn pawnPromoted3 = new Pawn(1);
        pawnPromoted3.promote(pawn);
        System.out.println("Pawn was promoted: " + pawnPromoted3.isHasBeenPromoted());

        System.out.println("\nPromoting Pawn to King: ");
        Pawn pawnPromoted4 = new Pawn(1);
        pawnPromoted4.promote(king);
        System.out.println("Pawn was promoted: " + pawnPromoted3.isHasBeenPromoted());

        // ************** To String **************
        System.out.println("\n"+pawn.toString());
        System.out.println(knight.toString());
        System.out.println(bishop.toString());
        System.out.println(rook.toString());
        System.out.println(queen.toString());
        System.out.println(king.toString());

        System.out.println("\n"+pawnPromoted.toString());
        System.out.println(pawnPromoted2.toString());
        System.out.println(pawnPromoted3.toString());
        System.out.println(pawnPromoted4.toString());
    }

}
