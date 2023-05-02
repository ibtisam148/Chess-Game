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

    public boolean selectionValidation(Selected selected, int move) {
        if (move % 2 == 1) {
            if (board[selected.fileSelect][selected.rankSelect].colour == Colour.WHITE) {
                return true;
            } else {
                return false;
            }
        } else {
            if (board[selected.fileSelect][selected.rankSelect].colour == Colour.BLACK) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean moveValidationAndMove(Selected selected, Moving moving) {
        boolean flag;

        flag = board[selected.fileSelect][selected.rankSelect].MovementValidation(selected, moving, validMoves(board[selected.fileSelect][selected.rankSelect].colour), board);

        if (flag == true) {
            movement(selected, moving);
            return true;
        }
        return false;
    }

    public Moving[] validMoves(Colour colour) {
        Moving[] list = new Moving[48];
        int p = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                try {
                    if (board[i][j].colour != colour) {
                        list[p] = new Moving(j, i);
                        p++;
                    }
                } catch (NullPointerException exception) {
                    list[p] = new Moving(j, i);
                    p++;
                }

            }
        }
        return list;
    }

    void movement(Selected selected, Moving moving) {
        board[moving.fileMove][moving.rankMove] = board[selected.fileSelect][selected.rankSelect];
        board[selected.fileSelect][selected.rankSelect] = null;
    }


}
