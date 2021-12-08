public class Queen extends Piece {
    public Queen(Colour colour) {
        super(colour);

        if (colour == Colour.WHITE){
            name = 'Q';
        }else{
            name = 'q';
        }
    }

    @Override
    public boolean Movement() {
        return false;
    }

    @Override
    public boolean Validation() {
        return false;
    }
}
