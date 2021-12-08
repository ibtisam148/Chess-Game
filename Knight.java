public class Knight extends Piece {
    public Knight(Colour colour) {
        super(colour);
        if (colour == Colour.WHITE){
            name = 'N';
        }else{
            name = 'n';
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
