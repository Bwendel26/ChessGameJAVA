package application;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
        for (int posX = 0; posX < pieces.length; posX++) {
            System.out.print((8 - posX) + " ");
            for (int posY = 0; posY < pieces.length; posY++) {
                printPiece(pieces[posX][posY]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        }
        else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
