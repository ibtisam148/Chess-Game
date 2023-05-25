/*
This class represents class named "Rook" that extends the "Piece" class. 
It represents a rook piece in a chess game.The constructor of the "Rook" 
class takes a parameter called "colour" to determine the color of the rook 
either white or black. 
*/
public class Rook extends Piece {
    public Rook(Colour colour) {
        super(colour);
        if (colour == Colour.WHITE) {
            name = 'R';
        } else {
            name = 'r';
        }

    }
    
/*
The "MovementValidation" method is an overridden method from the superclass. 
The method performs validation for the rook's movement. It first checks if
the specified move is in the list of possible moves. If not, it prints "Invalid 
move" and returns false, indicating that the move is not valid.
*/
    
    @Override
    public boolean MovementValidation(Selected selected, Moving moving, Moving[] list, Piece board[][]) {
        int c, i;
        boolean flag = false;
        boolean flag1 = false;

        for (i = 0; i < list.length; i++) {
            if ((list[i].rankMove == moving.rankMove) && (list[i].fileMove == moving.fileMove)) {
                flag1 = true;
            }
        }
        if (!flag) {
            System.out.print("Invalid move.\n");
            return false;
        }
        if ((moving.fileMove == selected.fileSelect && moving.rankMove > selected.rankSelect)) {

            for (c = selected.rankSelect + 1; c < moving.rankMove; c++) {
                if (board[selected.fileSelect][c] != null) {
                    flag = true;
                }
            }
            if (!flag) {
                return true;
            } else {
                System.out.print("Invalid move.\n");
                return false;
            }
        } else if ((moving.fileMove == selected.fileSelect && moving.rankMove < selected.rankSelect)) {

            for (c = selected.rankSelect - 1; c > moving.rankMove; c--) {
                if (board[selected.fileSelect][c] != null) {
                    flag = true;
                }
            }
            if (!flag) {
                return true;
            } else {
                System.out.print("Invalid move.\n");
                return false;
            }
        } else if ((moving.rankMove == selected.rankSelect && moving.fileMove > selected.fileSelect)) {

            for (c = selected.fileSelect + 1; c < moving.fileMove; c++) {
                if (board[c][selected.rankSelect] != null) {
                    flag = true;
                }
            }
            if (!flag) {
                return true;
            } else {
                System.out.print("Invalid move.\n");
                return false;
            }
        } else if ((moving.rankMove == selected.rankSelect && moving.fileMove < selected.fileSelect)) {

            for (c = selected.fileSelect - 1; c > moving.fileMove; c--) {
                if (board[c][selected.rankSelect] != null) {
                    flag = true;
                }
            }
            if (!flag) {
                return true;
            } else {
                System.out.print("Invalid move.\n");
                return false;
            }
        } else {
            System.out.print("Invalid move.\n");
            return false;
        }
    }


}
