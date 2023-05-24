/*
This class represents the king piece in a chess game. This class contains funtion implementations that are related to king only.
As this is a type of object it can be created as piece object.
This contains funtion that checkes whether the piece can move or not in selected position.
*/
public class King extends Piece {
    public King(Colour colour) {
        super(colour);

        if (colour == Colour.WHITE) {
            name = 'K';
        } else {
            name = 'k';
        }
    }

//The function to check the movement of the piece and also check whether the is obstructed or not.
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
