public class Queen extends Piece {
    public Queen(Colour colour) {
        super(colour);

        if (colour == Colour.WHITE) {
            name = 'Q';
        } else {
            name = 'q';
        }
    }

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
            if (flag == false) {
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
            if (flag == false) {
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
            if (flag == false) {
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
            if (flag == false) {
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
            if (flag == false) {
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
            if (flag == false) {
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
            if (flag == false) {
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
            if (flag == false) {
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
