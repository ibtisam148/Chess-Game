abstract public class Piece {
    Colour colour;
    char name = '-';

    public Piece(Colour colour) {
        this.colour = colour;
    }

    abstract public boolean Movement();

    abstract public boolean Validation();
}
