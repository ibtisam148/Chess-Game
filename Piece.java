abstract public class Piece {
    Colour colour;
    char name = '-';

    public Piece(Colour colour) {
        this.colour = colour;
    }


    public abstract boolean MovementValidation(Selected selected, Moving moving, Moving[] list, Piece board[][]);
}
