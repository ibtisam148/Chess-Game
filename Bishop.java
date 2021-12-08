public class Bishop extends Piece {
    public Bishop(Colour colour) {
        super(colour);
        if (colour == Colour.WHITE){
            name = 'B';
        }else{
            name = 'b';
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
