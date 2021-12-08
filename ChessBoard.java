public class ChessBoard {
    Piece board[][];

    public ChessBoard() {
        board = new Piece[][]{
                {new Rook(Colour.BLACK), new Knight(Colour.BLACK), new Bishop(Colour.BLACK), new Queen(Colour.BLACK), new King(Colour.BLACK), new Bishop(Colour.BLACK), new Knight(Colour.BLACK), new Rook(Colour.BLACK)},
                {new Pawn(Colour.BLACK), new Pawn(Colour.BLACK), new Pawn(Colour.BLACK), new Pawn(Colour.BLACK), new Pawn(Colour.BLACK), new Pawn(Colour.BLACK), new Pawn(Colour.BLACK), new Pawn(Colour.BLACK)},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {new Pawn(Colour.WHITE), new Pawn(Colour.WHITE), new Pawn(Colour.WHITE), new Pawn(Colour.WHITE), new Pawn(Colour.WHITE), new Pawn(Colour.WHITE), new Pawn(Colour.WHITE), new Pawn(Colour.WHITE)},
                {new Rook(Colour.WHITE), new Knight(Colour.WHITE), new Bishop(Colour.WHITE), new Queen(Colour.WHITE), new King(Colour.WHITE), new Bishop(Colour.WHITE), new Knight(Colour.WHITE), new Rook(Colour.WHITE)}
        };
    }


    public void chessBoardPrint() {
        int rank = 1;

        System.out.print("Small letters (i.e k,q..) are black pieces.\n" +
                "Capital letters (i.e K,Q..) are white pieces.\n" +
                "Enter 'z0' in piece selection to give up.\n\n\n" +
                "      ");
        for (char file = 'A'; file <= 'H'; file++) {
            System.out.printf("%3c", file);
        }

        System.out.print("\n\n");
        for (int n = 0; n < 8; n++) {
            System.out.printf("%4d  ", rank);
            for (int i = 0; i < 8; i++) {
                try {
                    System.out.printf("%3c", board[n][i].name);
                } catch (NullPointerException exception) {
                    System.out.printf("%3c", '-');
                }
            }
            rank++;
            System.out.println();
        }


    }
}