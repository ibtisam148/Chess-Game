public class Pawn extends Piece {
    public Pawn(Colour colour) {
        super(colour);
        if (colour == Colour.WHITE){
            name = 'P';
        }else{
            name = 'p';
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
