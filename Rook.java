public class Rook extends Piece{
    public Rook(Colour colour) {
        super(colour);
        if (colour == Colour.WHITE){
            name = 'R';
        }else{
            name = 'r';
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
