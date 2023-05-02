public class Rook extends Piece {
    public Rook(Colour colour) {
        super(colour);
        if (colour == Colour.WHITE) {
            name = 'R';
        } else {
            name = 'r';
        }

    }

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
