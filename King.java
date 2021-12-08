public class King extends Piece {
    public King(Colour colour) {
        super(colour);

        if (colour == Colour.WHITE){
            name = 'K';
        }else{
            name = 'k';
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
