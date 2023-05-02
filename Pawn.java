import java.util.Scanner;

public class Pawn extends Piece {
    boolean firstMove = true;

    public Pawn(Colour colour) {
        super(colour);
        if (colour == Colour.WHITE) {
            name = 'P';
        } else {
            name = 'p';
        }
    }

    @Override
    public boolean MovementValidation(Selected selected, Moving moving, Moving[] list, Piece board[][]) {
        boolean flag = false;

        for (int i = 0; i < list.length; i++) {
            if ((list[i].rankMove == moving.rankMove) && (list[i].fileMove == moving.fileMove)) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.printf("Invalid move.\n");
            return false;
        }

        if (colour == Colour.BLACK) {
            if (firstMove == true) {
                if ((moving.fileMove == selected.fileSelect + 1 && moving.rankMove == selected.rankSelect) && (board[moving.fileMove][moving.rankMove] == null)) {
                    firstMove = false;
                    return true;
                } else if ((moving.fileMove == selected.fileSelect + 2 && moving.rankMove == selected.rankSelect) && (board[moving.fileMove][moving.rankMove] == null && board[moving.fileMove - 1][moving.rankMove] == null)) {
                    firstMove = false;
                    return true;
                } else if (((moving.fileMove == selected.fileSelect + 1 && moving.rankMove == selected.rankSelect + 1) && (board[moving.fileMove][moving.rankMove] != null))) {
                    firstMove = false;
                    return true;
                } else if (((moving.fileMove == selected.fileSelect + 1 && moving.rankMove == selected.rankSelect - 1) && (board[moving.fileMove][moving.rankMove] != null))) {
                    firstMove = false;
                    return true;
                } else {
                    System.out.print("Invalid move.\n");
                    return false;
                }
            } else {
                if ((moving.fileMove == selected.fileSelect + 1 && moving.rankMove == selected.rankSelect) && (board[moving.fileMove][moving.rankMove] == null)) {
                    if (moving.fileMove == 7) {
                        board[selected.fileSelect][selected.rankSelect] = pawnPromote();
                    }
                    return true;
                } else if (((moving.fileMove == selected.fileSelect + 1 && moving.rankMove == selected.rankSelect + 1) && (board[moving.fileMove][moving.rankMove] != null))) {
                    if (moving.fileMove == 7) {
                        board[selected.fileSelect][selected.rankSelect] = pawnPromote();
                    }
                    return true;
                } else if (((moving.fileMove == selected.fileSelect + 1 && moving.rankMove == selected.rankSelect - 1) && (board[moving.fileMove][moving.rankMove] != null))) {
                    if (moving.fileMove == 7) {
                        board[selected.fileSelect][selected.rankSelect] = pawnPromote();
                    }
                    return true;
                } else {
                    System.out.print("Invalid move.\n");
                    return false;
                }
            }
        } else {
            if (firstMove == true) {
                if ((moving.fileMove == selected.fileSelect - 1 && moving.rankMove == selected.rankSelect) && (board[moving.fileMove][moving.rankMove] == null)) {
                    firstMove = false;
                    return true;
                } else if ((moving.fileMove == selected.fileSelect - 2 && moving.rankMove == selected.rankSelect) && (board[moving.fileMove][moving.rankMove] == null && board[moving.fileMove + 1][moving.rankMove] == null)) {
                    firstMove = false;
                    return true;
                } else if (((moving.fileMove == selected.fileSelect - 1 && moving.rankMove == selected.rankSelect + 1) && (board[moving.fileMove][moving.rankMove] != null))) {
                    firstMove = false;
                    return true;
                } else if (((moving.fileMove == selected.fileSelect - 1 && moving.rankMove == selected.rankSelect - 1) && (board[moving.fileMove][moving.rankMove] != null))) {
                    firstMove = false;
                    return true;
                } else {
                    System.out.print("Invalid move.\n");
                    return false;
                }
            }


            if ((moving.fileMove == selected.fileSelect - 1 && moving.rankMove == selected.rankSelect) && (board[moving.fileMove][moving.rankMove] == null)) {
                if (moving.fileMove == 0) {
                    board[selected.fileSelect][selected.rankSelect] = pawnPromote();
                }
                return true;
            } else if (((moving.fileMove == selected.fileSelect - 1 && moving.rankMove == selected.rankSelect + 1) && (board[moving.fileMove][moving.rankMove] != null))) {
                if (moving.fileMove == 0) {
                    board[selected.fileSelect][selected.rankSelect] = pawnPromote();
                }
                return true;
            } else if (((moving.fileMove == selected.fileSelect - 1 && moving.rankMove == selected.rankSelect - 1) && (board[moving.fileMove][moving.rankMove] != null))) {
                if (moving.fileMove == 0) {
                    board[selected.fileSelect][selected.rankSelect] = pawnPromote();
                }
                return true;
            } else {

                System.out.print("Invalid move.\n");
                return false;
            }

        }
    }


    Piece pawnPromote() {
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose promotion:\n");
        System.out.print(" 1= Queen, 2= Rook, 3= Knight, 4= Bishop.");

        c = scanner.nextInt();
        switch (c) {
            case 1: {
                return new Queen(colour);
            }
            case 2: {
                return new Rook(colour);
            }
            case 3: {
                return new Knight(colour);
            }
            case 4: {
                return new Bishop(colour);
            }
            default: {
                return null;
            }
        }

    }
}
    


