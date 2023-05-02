public class Knight extends Piece {
    public Knight(Colour colour) {
        super(colour);
        if (colour == Colour.WHITE) {
            name = 'N';
        } else {
            name = 'n';
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

        if ((moving.rankMove == (selected.rankSelect - 2) && moving.fileMove == selected.fileSelect - 1) || (moving.rankMove == (selected.rankSelect - 2) && moving.fileMove == selected.fileSelect + 1)) {
            return true;
        } else if ((moving.rankMove == (selected.rankSelect + 2) && moving.fileMove == selected.fileSelect - 1) || (moving.rankMove == (selected.rankSelect + 2) && moving.fileMove == selected.fileSelect + 1)) {
            return true;
        } else if ((moving.fileMove == (selected.fileSelect + 2) && moving.rankMove == selected.rankSelect - 1) || (moving.fileMove == (selected.fileSelect + 2) && moving.rankMove == selected.rankSelect + 1)) {
            return true;
        } else if ((moving.fileMove == (selected.fileSelect - 2) && moving.rankMove == selected.rankSelect - 1) || (moving.fileMove == (selected.fileSelect - 2) && moving.rankMove == selected.rankSelect + 1)) {
            return true;
        } else {
            System.out.printf("Invalid move.\n");
            return false;
        }
    }


}
