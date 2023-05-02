public class King extends Piece {
    public King(Colour colour) {
        super(colour);

        if (colour == Colour.WHITE) {
            name = 'K';
        } else {
            name = 'k';
        }
    }


    @Override
    public boolean MovementValidation(Selected selected, Moving moving, Moving[] list, Piece board[][]) {

        boolean flag = false;
        int i, c;

        for (i = 0; i < list.length; i++) {
            if ((list[i].rankMove == moving.rankMove) && (list[i].fileMove == moving.fileMove)) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.print("Invalid move.\n");
            return false;
        }
        if (moving.fileMove == selected.fileSelect + 1) {
            return true;
        } else if (moving.fileMove == selected.fileSelect - 1) {
            return true;
        } else if (moving.rankMove == selected.rankSelect + 1) {
            return true;
        } else if (moving.rankMove == selected.rankSelect - 1) {
            return true;
        } else if ((moving.fileMove == selected.fileSelect + 1 && moving.rankMove == selected.rankSelect + 1)) {
            return true;
        } else if ((moving.fileMove == selected.fileSelect - 1 && moving.rankMove == selected.rankSelect - 1)) {
            return true;
        } else if ((moving.fileMove == selected.fileSelect - 1 && moving.rankMove == selected.rankSelect + 1)) {
            return true;
        } else if ((moving.fileMove == selected.fileSelect + 1 && moving.rankMove == selected.rankSelect - 1)) {
            return true;
        } else {
            return false;
        }

    }
}
