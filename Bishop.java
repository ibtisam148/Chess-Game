public class Bishop extends Piece {
    public Bishop(Colour colour) {
        super(colour);
        if (colour == Colour.WHITE) {
            name = 'B';
        } else {
            name = 'b';
        }
    }

    @Override
    public boolean MovementValidation(Selected selected, Moving moving, Moving[] list, Piece[][] board) {
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
        } else {
            System.out.print("Invalid move.\n");
            return false;
        }
    }

}
