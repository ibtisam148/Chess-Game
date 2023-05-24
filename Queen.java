/*
This class represents the Queen piece in a chess game. This class contains funtion implementations that are related to Queen only.
As this is a type of object it can be created as piece object.
This contains funtion that checkes whether the piece can move or not in selected position.
*/
public class Queen extends Piece {
    public Queen(Colour colour) {
        super(colour);

        if (colour == Colour.WHITE) {
            name = 'Q';
        } else {
            name = 'q';
        }
    }
//This functions validated whether the selected position can be accessed by this piece or not. This checks vertical, horzontal and diagonal directions.
    @Override
    public boolean MovementValidation(Selected selected, Moving moving, Moving[] list, Piece[][] board) {
        boolean flag = false;
        int i, c;

        for (i = 0; i < list.length; i++) {
            if ((list[i].rankMove == moving.fileMove) && (list[i].fileMove == moving.rankMove)) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.print("Invalid move.\n");
            return false;
        }
        if ((moving.fileMove < selected.fileSelect) && (moving.rankMove < selected.rankSelect)) {

            i = selected.rankSelect - 1;
            for (c = selected.fileSelect - 1; c > moving.fileMove; c--) {
                if (board[c][i] != null) {
                    flag = true;
                }
                i--;
            }
            if (!flag) {
                return true;
            } else {
                System.out.print("Invalid move.\n");
                return false;
            }
        } else if ((moving.fileMove > selected.fileSelect) && (moving.rankMove > selected.rankSelect)) {

            i = selected.rankSelect + 1;
            for (c = selected.fileSelect + 1; c > moving.fileMove; c++) {
                if (board[c][i] != null) {
                    flag = true;
                }
                i++;
            }
            if (!flag) {
                return true;
            } else {
                System.out.print("Invalid move.\n");
                return false;
            }
        } else if ((moving.fileMove < selected.fileSelect) && (moving.rankMove > selected.rankSelect)) {

            i = selected.rankSelect + 1;
            for (c = selected.fileSelect - 1; c > moving.fileMove; c--) {
                if (board[c][i] != null) {
                    flag = true;
                }
                i++;
            }
            if (!flag) {
                return true;
            } else {
                System.out.print("Invalid move.\n");
                return false;
            }
        } else if ((moving.fileMove > selected.fileSelect) && (moving.rankMove < selected.rankSelect)) {

            i = selected.rankSelect - 1;
            for (c = selected.fileSelect + 1; c > moving.fileMove; c++) {
                if (board[c][i] != null) {
                    flag = true;
                }
                i--;
            }
            if (!flag) {
                return true;
            } else {
                System.out.print("Invalid move.\n");
                return false;
            }
        } else if ((moving.fileMove == selected.fileSelect && moving.rankMove > selected.rankSelect)) {

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
